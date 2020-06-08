package com.api.crudkafkaproducer.service.impl

import com.api.crudkafkaproducer.service.PostService
import org.apache.kafka.clients.producer.KafkaProducer
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class PostServiceImpl : PostService {

    @Autowired
    lateinit var producer : KafkaTemplate<String, String>


    companion object {
        internal val LOGGER = LoggerFactory.getLogger(KafkaProducer::class.java)
        internal val TOPIC = "cliente"

    }

    override fun postTopic(message: String) {
        LOGGER.info("Produce message: $message")
        this.producer.send(TOPIC, message)
    }


}