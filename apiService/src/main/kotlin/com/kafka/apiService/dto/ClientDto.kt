package com.kafka.apiService.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.kafka.apiService.entity.model.Client
import com.kafka.apiService.entity.model.ClientType
import java.util.*

internal data class ClientDto(
        @JsonProperty("identifier") val identifier: UUID,
        @JsonProperty("firstName") val firstName:String,
        @JsonProperty("lastName") val lastName:String,
        @JsonProperty("email") val email:String,
        @JsonProperty("active") val isActive:Boolean,
        @JsonProperty("type") val type: String
)

internal fun ClientDto.toEntity(clientType: ClientType) =
        Client(
                identifier = identifier,
                firstName = firstName,
                lastName = lastName,
                email = email,
                isActive = isActive,
                type = clientType,
        )