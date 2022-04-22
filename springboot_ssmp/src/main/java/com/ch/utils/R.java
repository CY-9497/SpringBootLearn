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

    public R() {}

    public R(Boolean flag){
        this.flag = flag;
    }
    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }

}
