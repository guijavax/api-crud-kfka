package com.api.crudkafkaconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudKafkaConsumerApplication

fun main(args: Array<String>) {
	runApplication<CrudKafkaConsumerApplication>(*args)
}
