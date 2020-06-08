package com.api.crudkafkaproducer.controller

import com.api.crudkafkaproducer.ClientEntitie
import com.api.crudkafkaproducer.service.PostService
import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path=["/api"])
class PostTopic {

    @Autowired
    lateinit var service : PostService

    @PostMapping("/post")
    fun post(@RequestBody valor : ClientEntitie) : ResponseEntity<Any> {

        val jsonToString : String = Gson().toJson(valor)

        service.postTopic(jsonToString)

        return ResponseEntity.ok(valor)
    }

}