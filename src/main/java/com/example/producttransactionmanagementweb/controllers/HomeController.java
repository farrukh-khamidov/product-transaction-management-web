package com.example.producttransactionmanagementweb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class HomeController {
    public String index() {
        return "index";
    }
}
