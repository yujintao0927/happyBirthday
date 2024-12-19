package org.example.controller;

import org.example.pojo.Result;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

    @Autowired
    UserService userService ;

    @PostMapping("/submit")
    public Result getInf(String name, String birthday) {
        String[] strings = birthday.split("-") ;
        int year = Integer.parseInt(strings[0]) ;
        int month = Integer.parseInt(String.valueOf(strings[1].charAt(0))) * 10 + Integer.parseInt(String.valueOf(strings[1].charAt(1))) ;
        int day = Integer.parseInt(String.valueOf(strings[2].charAt(0))) * 10 + Integer.parseInt(String.valueOf(strings[2].charAt(1))) ;

        userService.addInf(name,year,month,day) ;

        return Result.success() ;
    }

    @PostMapping("/register")
    public Result register(String username, String password) {

    }

    @PostMapping("/login")
    public Result login(String username, String password) {

    }



}
