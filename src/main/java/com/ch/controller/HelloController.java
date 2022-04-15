package com.ch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 渔郎
 * @CLassName HelloController
 * @Description TODO
 * @Date 2022/4/15 11:45
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot!";
    }

}
