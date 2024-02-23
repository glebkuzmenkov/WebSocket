package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WEbController {
    @GetMapping("/users/{name}")
    public String mainPage(@PathVariable String name){
        final User user = new User(name);
        return "mainPage";
    }
}
