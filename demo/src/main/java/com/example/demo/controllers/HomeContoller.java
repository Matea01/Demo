package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {

    @RequestMapping("/")
    public String home(){
        return "hello";
    }
}
