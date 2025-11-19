package com.demo.keepnotes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Test {

    @GetMapping("/test")
    public String testEndpoint() {
        return "The application is running successfully!";
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello from Keepnotes Application!";
    }
}
