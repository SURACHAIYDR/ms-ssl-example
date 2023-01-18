package com.surachai.mssslexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping(path = "/greeting")
    public String greeting(){

        return "Hello this from server with secure socket.";
    }
}
