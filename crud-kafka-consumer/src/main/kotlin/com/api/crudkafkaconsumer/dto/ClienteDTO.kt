package com.api.crudkafkaconsumer.dto

import java.util.*


data class ClienteDTO (
        var nome : String = "",
        var cpf : Int = 0,
        var dataNasc : Date
)