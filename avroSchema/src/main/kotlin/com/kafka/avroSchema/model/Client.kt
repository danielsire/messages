package com.kafka.avroSchema.model

import org.apache.avro.Schema
import org.apache.avro.SchemaBuilder

class Client {
    companion object {
        private const val DEFAULT_NAMESPACE = "com.kafka.avroSchema"

        fun createAvroHttpRequestSchema(): Schema {
            val clientType: Schema = SchemaBuilder.record("ClientType")
                .namespace(DEFAULT_NAMESPACE)
                .fields().requiredString("type")
                .endRecord()


            return SchemaBuilder.record("Client")
                .namespace(DEFAULT_NAMESPACE)
                .fields().requiredString("identifier")
                .requiredString("firstName")
                .requiredString("lastName")
                .requiredString("email")
                .requiredBoolean("isActive")
                .name("type")
                .type(clientType)
                .noDefault()
                .endRecord()
        }
    }
}