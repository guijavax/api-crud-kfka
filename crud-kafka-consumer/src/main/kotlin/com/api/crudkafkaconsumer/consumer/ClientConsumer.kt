package com.api.crudkafkaconsumer.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class ClientConsumer {

     @KafkaListener(topics = ["cliente"], groupId = "group_id")
    fun consumeTopicClient(message : String) {
        println(message)
    }
}