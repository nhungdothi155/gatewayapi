package com.go.accountmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")
public class AccountManagementController {

    @GetMapping
    public String hello(){
        return "Hello acocunts";
    }
}
