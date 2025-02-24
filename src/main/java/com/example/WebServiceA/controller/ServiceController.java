package com.example.WebServiceA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @GetMapping("/hello")
    // green page version 1.0
    public String hello() {
        return "greenpage";
    }
    
}
