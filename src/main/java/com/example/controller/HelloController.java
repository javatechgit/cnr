package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello Copilot World!";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Copilot") String name) {
        return "Hello, " + name + "!";
    }

}