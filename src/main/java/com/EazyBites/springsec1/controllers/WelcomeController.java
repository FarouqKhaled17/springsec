package com.EazyBites.springsec1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to EazyBank Without Security!";
    }

    @GetMapping("/")
    public String index(){
        return "Welcome to EazyBank!";
    }
}

