package com.EazyBites.springsec1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @GetMapping("/balance")
    public String balanceDetails(){
        return "Here is your current balance information.";
    }
}
