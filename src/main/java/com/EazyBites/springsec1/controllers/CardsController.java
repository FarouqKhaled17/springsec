package com.EazyBites.springsec1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping("/cards")
    public String cardsDetails(){
        return "Here are your credit/debit cards.";
    }
}
