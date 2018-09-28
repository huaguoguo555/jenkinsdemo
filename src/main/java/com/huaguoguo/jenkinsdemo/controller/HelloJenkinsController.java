package com.huaguoguo.jenkinsdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HelloJenkinsController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public Object hello(){
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        logger.info(format);
        return "hello jenkins aaa001";
    }

}
