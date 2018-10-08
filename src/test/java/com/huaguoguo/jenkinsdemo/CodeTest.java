package com.huaguoguo.jenkinsdemo;

import org.junit.Test;

import java.text.MessageFormat;

public class CodeTest {

    @Test
    public void test1(){
        String format = MessageFormat.format("123{0}", "456");
        System.out.println(format);
    }

    @Test
    public void test2(){

    }
}
