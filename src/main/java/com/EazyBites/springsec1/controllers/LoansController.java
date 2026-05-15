package com.EazyBites.springsec1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/loans")
    public String loansDetails(){
        return "Here are your loan details.";
    }
}
