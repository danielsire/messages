package com.kafka.avroSchema.model

import org.apache.avro.Schema
import org.apache.avro.SchemaBuilder

class ClientEvent {
    companion object {
        private const val DEFAULT_NAMESPACE = "com.kafka.avroSchema"

        fun createAvroHttpRequestSchema() = SchemaBuilder.record("ClientEvent")
                .namespace(DEFAULT_NAMESPACE)
                .fields().requiredString("identifier")
                .requiredString("email")
                .requiredString("type")
                .endRecord()
    }
}