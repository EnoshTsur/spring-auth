package com.enosh.auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @GetMapping("/findById/{id}")
    public String helloWorld(@PathVariable("id") Long id){
        return "<h1>Company Aroma!</h1>";
    }
}
