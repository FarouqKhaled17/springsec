package com.EazyBites.springsec1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contact")
    public String contactDetails(){
        return "Contact us at support@eazybank.com or call 1-800-123-4567.";
    }
}
