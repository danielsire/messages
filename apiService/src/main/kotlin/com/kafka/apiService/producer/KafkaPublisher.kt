package com.kafka.apiService.producer

import com.kafka.apiService.config.KafkaConfigProperties
import mu.KotlinLogging
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.clients.producer.ProducerRecord
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.kafka.sender.KafkaSender
import reactor.kafka.sender.SenderOptions
import java.util.*
import com.kafka.avroSchema.Client as ClientAvro
import com.kafka.avroSchema.ClientEvent as ClientEventAvro

@Component
class KafkaPublisher(private val kafkaConfigProperties: KafkaConfigProperties) {

    private val logger = KotlinLogging.logger {  }

    private val producerProps: Map<String, String> = mapOf(
        ProducerConfig.BOOTSTRAP_SERVERS_CONFIG to kafkaConfigProperties.broker,
        ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG to kafkaConfigProperties.serializer,
        ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG to kafkaConfigProperties.serializer,
        "schema.registry.url" to kafkaConfigProperties.schemaRegistryUrl
    )

    private val senderOptions: SenderOptions<String, ClientAvro> = SenderOptions.create<String, ClientAvro>(producerProps)
    private val kafkaSender: KafkaSender<String, ClientAvro> = KafkaSender.create(senderOptions)

    private val clientCreatedEventSenderOptions: SenderOptions<String, ClientEventAvro> = SenderOptions.create<String, ClientEventAvro>(producerProps)
    private val clientCreatedEventKafkaSender: KafkaSender<String, ClientEventAvro> = KafkaSender.create(clientCreatedEventSenderOptions)

    fun publishMessage(key: String, value: ClientAvro): Mono<Void> {
        val producerRecord: ProducerRecord<String, ClientAvro> = ProducerRecord(kafkaConfigProperties.createClientRequestTopic, key, value)

        return kafkaSender.createOutbound()
            .send(Mono.just(producerRecord))
            .then()
            .doOnSuccess { logger.info("Successfully sent a CreateClientRequest message with id $key") }
    }

    fun publishClientCreatedEvent(key: String, value: ClientEventAvro): Mono<Void> {
        val producerRecord: ProducerRecord<String, ClientEventAvro> = ProducerRecord(kafkaConfigProperties.clientCreatedEventTopic, key, value)

        return clientCreatedEventKafkaSender.createOutbound()
            .send(Mono.just(producerRecord))
            .then()
            .doOnSuccess { logger.info("Successfully sent a ClientCreatedEvent message with id $key") }
    }

    companion object {
        fun generateMessageKey(): String {
            return UUID.randomUUID().toString()
        }
    }
}