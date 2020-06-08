package com.api.crudkafkaproducer

import com.fasterxml.jackson.annotation.JsonFormat
import org.jetbrains.annotations.TestOnly
import java.util.*

data class ClientEntitie(
        val name : String?,
        val cpf: Int?,

        @JsonFormat(pattern = "dd/MM/yyyy")
        val dataNasc : Date
)

