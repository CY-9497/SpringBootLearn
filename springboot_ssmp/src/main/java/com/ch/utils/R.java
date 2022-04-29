package com.ch.utils;

import lombok.Data;

/**
 * @author 渔郎
 * @CLassName R
 * @Description TODO
 * @Date 2022/4/22 10:19
 */
@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R() {}

    public R(Boolean flag){
        this.flag = flag;
    }
    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }
    public R(String msg){
        this.flag = false;
        this.msg = msg;
    }
    public R(Boolean flag, String msg){
        this.flag = flag;
        this.msg = msg;
    }

}
