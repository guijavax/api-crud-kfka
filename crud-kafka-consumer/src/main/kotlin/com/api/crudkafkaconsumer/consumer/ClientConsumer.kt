package com.api.crudkafkaconsumer.consumer

import com.api.crudkafkaconsumer.dto.ClienteDTO
import com.google.gson.Gson
import org.springframework.boot.json.GsonJsonParser
import org.springframework.http.converter.json.GsonFactoryBean
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class ClientConsumer {

     @KafkaListener(topics = ["cliente"], groupId = "group_id")
    fun consumeTopicClient(message : String) {
         var cliente =  Gson().fromJson(message, ClienteDTO::class.java)
        println(message)
    }
}