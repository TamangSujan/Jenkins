package com.marcos.firsttest.controller;

import com.marcos.firsttest.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLController {
    @GetMapping("/api")
    public String getName(){
        return "Markosh";
    }

    @GetMapping("/api/json")
    public Person getPerson(){
        Person p = new Person();
        p.setName("Markosh");
        return p;
    }
}
