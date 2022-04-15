package com.ch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 渔郎
 * @CLassName com.ch.HelloApplication
 * @Description TODO
 * @Date 2022/4/15 11:49
 *
 * 引导类  SpringBoot的入口
 */
@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }
}
