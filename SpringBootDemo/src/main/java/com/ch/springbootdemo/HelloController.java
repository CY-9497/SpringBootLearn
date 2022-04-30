package com.ch.springbootdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 渔郎
 * @CLassName HelloController
 * @Description TODO
 * @Date 2022/4/15 15:15
 */
@Slf4j
@RestController
public class HelloController {

//    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    private MysqlDatasource datasource;
    @Autowired
    public void setDatasource(MysqlDatasource datasource) {
        this.datasource = datasource;
    }

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(datasource);
        log.debug("debug..");
        log.info("info..");
        log.warn("warn..");
        log.error("error..");
        return "hello SpringBoot!!!";
    }
}
