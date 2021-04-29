package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping(path = ["/caller/test"])
class CallerTestController {

    @GetMapping
    fun testApi(): String{
        val restTemplate = RestTemplate()
        val callMeUrl = "http://call-me-application:8080/call/test"
        return "Successfully called: " + restTemplate.getForEntity(callMeUrl, String::class.java).toString()
    }
}