package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/pricing")
public class PricingController {

    @GetMapping
    public String pricing(){
        return "pricing";
    }
}
