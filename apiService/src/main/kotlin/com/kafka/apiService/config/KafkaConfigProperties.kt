package com.kafka.apiService.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "kafka")
data class KafkaConfigProperties(
    val broker: String,
    val serializer: String,
    val deserializer: String,
    val schemaRegistryUrl: String,
    val createClientRequestTopic: String,
    val clientCreatedEventTopic: String
)