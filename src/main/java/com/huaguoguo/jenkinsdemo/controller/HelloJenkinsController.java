package com.huaguoguo.jenkinsdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloJenkinsController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public Object hello(){
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        logger.info(format);
        return "hello jenkins aaa003";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public Object helloPost(HttpServletRequest request){
        Map<String, String[]> requestParameterMap = request.getParameterMap();
        logger.info("========请求参数数量："+requestParameterMap.size());
        for (Map.Entry<String, String[]> entry : requestParameterMap.entrySet()) {
            logger.info(entry.getKey() + " >>> " + Arrays.toString(entry.getValue()));
        }
        logger.info("========end========");
        return "hello jenkins aaa003";
    }

}
