package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contact {
    @RequestMapping("/Contact")
    public String myEmail(){
        return "KNAndrikov18@codingburgas.bg";
    }
}
