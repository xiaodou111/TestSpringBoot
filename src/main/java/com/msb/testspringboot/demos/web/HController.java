package com.msb.testspringboot.demos.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HController {
    @RequestMapping("/hello1")
    public String hello1(){
        return "hello1";
    }
}
