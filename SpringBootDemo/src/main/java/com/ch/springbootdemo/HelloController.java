package com.ch.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 渔郎
 * @CLassName HelloController
 * @Description TODO
 * @Date 2022/4/15 15:15
 */
@RestController
public class HelloController {

    private MysqlDatasource datasource;

    @Autowired
    public void setDatasource(MysqlDatasource datasource) {
        this.datasource = datasource;
    }

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(datasource);
        return "hello SpringBoot!!!";
    }
}
