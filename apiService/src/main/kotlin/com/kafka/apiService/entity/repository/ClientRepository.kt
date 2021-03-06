package com.kafka.apiService.entity.repository

import com.kafka.apiService.entity.model.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
internal interface ClientRepository: JpaRepository<Client, Long>