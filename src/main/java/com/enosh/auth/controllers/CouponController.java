package com.enosh.auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CouponController {

    @GetMapping("/getAllCoupons")
    public String getAllCoupons() {
        return "<h1>All Coupons</h1>";
    }
}
