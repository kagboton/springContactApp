package com.kagboton.scapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${conference.name:world}")
    private String conference;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello " + conference;
    }

}
