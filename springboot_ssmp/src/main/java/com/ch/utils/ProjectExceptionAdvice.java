package com.ch.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 渔郎
 * @CLassName ProjectExceptionAdvice
 * @Description TODO
 * @Date 2022/4/29 11:26
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler
    public R doException(Exception e){
        //记入日志
        //通知运维
        //通知开发
        e.printStackTrace();
        return  new R("服务器故障，请稍后重试!");
    }
}
