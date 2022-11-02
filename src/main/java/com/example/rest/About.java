package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class About {
    @RequestMapping("/About")
    public String aboutMe(){
        return "Ucha v PGKPI posledna godina, igraq voleibol, genji meinovete gi preziram i da jivee hranata.";
    }
}
