package com.enosh.auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/company")
public class CompanyController {


    @GetMapping("/me")
    public String getPrincipal(Principal principal){
        return "<h1>Company: " + (principal != null ? principal.getName() : "guest") + "</h1>";
    }
}
