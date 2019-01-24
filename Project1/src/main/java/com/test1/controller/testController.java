package com.test1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {


    @RequestMapping("/check")
    public String func() {
        return "okkk";
    }
}
