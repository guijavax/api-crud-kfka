package com.api.crudkafkaproducer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudKafkaProducerApplication

fun main(args: Array<String>) {
	runApplication<CrudKafkaProducerApplication>(*args)
}
