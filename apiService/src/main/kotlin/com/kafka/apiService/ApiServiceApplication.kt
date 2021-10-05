package com.kafka.apiService

import com.kafka.avroSchema.model.Client
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiServiceApplication

fun main(args: Array<String>) {
	runApplication<ApiServiceApplication>(*args)
}
