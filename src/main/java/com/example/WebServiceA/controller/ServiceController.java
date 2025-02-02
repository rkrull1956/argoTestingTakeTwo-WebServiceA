package com.example.WebServiceA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from WebServiceA!";
    }
    
}
