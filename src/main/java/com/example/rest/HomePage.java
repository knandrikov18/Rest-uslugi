package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {
    @RequestMapping("/Home")
    public String hello(){
        return "Welcome user";
    }
}
