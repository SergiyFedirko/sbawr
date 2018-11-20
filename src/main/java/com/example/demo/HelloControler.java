package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @GetMapping(path = "/api/hello")
    public String hello(){
        return "Hello from the server!";
    }
}
