package com.kafka.avroSchema.generator

import com.kafka.avroSchema.model.Client
import com.kafka.avroSchema.model.ClientEvent
import org.apache.avro.compiler.specific.SpecificCompiler
import org.apache.avro.Schema
import org.apache.commons.io.FileUtils
import java.io.File
import java.io.IOException
import java.nio.charset.Charset

object AvroClassGenerator {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {

        val generatedSchemaPath = args.first().trim()
        val avroName = args[1].trim()
        val avroEventName = args[2].trim()

        File(generatedSchemaPath).mkdirs()

        FileUtils.write(
            File("$generatedSchemaPath/$avroName.avsc"),
            Client.createAvroHttpRequestSchema().toString(true) as CharSequence,
            Charset.defaultCharset()
        )

        FileUtils.write(
            File("$generatedSchemaPath/$avroEventName.avsc"),
            ClientEvent.createAvroHttpRequestSchema().toString(true) as CharSequence,
            Charset.defaultCharset()
        )

        val compilerEvent = SpecificCompiler(Schema.Parser().parse(File("$generatedSchemaPath/$avroEventName.avsc")))
        compilerEvent.compileToDestination(File("src/main/resources"), File("src/main/kotlin"))

        val compiler = SpecificCompiler(Schema.Parser().parse(File("$generatedSchemaPath/$avroName.avsc")))
        compiler.compileToDestination(File("src/main/resources"), File("src/main/kotlin"))
    }
}