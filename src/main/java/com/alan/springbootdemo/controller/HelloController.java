package com.alan.springbootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@Slf4j
public class HelloController {

    /**
     * 测试方法
     * @return
     */
    @GetMapping ("hello")
    public String hello(){
        log.info("rest hello");
        System.out.println("rest hello");

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss ");


        return "hello " +sdf.format(d);
    }
}
