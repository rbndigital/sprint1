package com.rbndigital.sprint1.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class DemoController {

    @GetMapping("/helloworld")
    public String hello() {
        return "Hello World!";
    }
}
