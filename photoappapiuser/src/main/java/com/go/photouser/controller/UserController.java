package com.go.photouser.controller;


import com.go.photouser.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    Environment env;

    @PostMapping
    public String createUser(@Valid @RequestBody  UserModel userDetails){
        return "create method user is created";
    }
}
