package com.fpt.helloworld.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
    @RequestMapping("")
    @ResponseBody
    public String index(){
        return "Hello World";
    }
}
