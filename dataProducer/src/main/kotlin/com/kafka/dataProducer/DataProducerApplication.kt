package com.kafka.dataProducer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DataProducerApplication

fun main(args: Array<String>) {
	runApplication<DataProducerApplication>(*args)
}
