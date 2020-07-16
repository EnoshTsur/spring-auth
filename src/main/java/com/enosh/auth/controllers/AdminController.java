package com.enosh.auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/getCustomerDetails/{id}")
    public String getCustomerDetails(@PathVariable("id") Long id) {
        return "<h1>Avner Baruch!</h1>";
    }
}
