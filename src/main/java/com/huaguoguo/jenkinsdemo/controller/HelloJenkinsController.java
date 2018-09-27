package com.huaguoguo.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJenkinsController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public Object hello(){
        return "hello jenkins 2:19";
    }
}
