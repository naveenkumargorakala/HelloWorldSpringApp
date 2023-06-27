package com.example.helloworldspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HelloController {


    @GetMapping("/")
    public String message(){
        return "Hello from BridgeLabz...";
    }
}
