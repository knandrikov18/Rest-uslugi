package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @RequestMapping("/User")
    public String userData(){
        return "User: Kaloyan Nikolaev Andrikov <br>" + "Age: 18 <br>" + "City: Burgas <br>";
    }
}
