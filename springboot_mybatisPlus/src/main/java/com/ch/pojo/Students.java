package com.ch.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author 渔郎
 * @CLassName Students
 * @Description TODO
 * @Date 2022/4/16 17:16
 */
@TableName("students")
public class Students {
    private String name;
    private String sex;
    private String address;

    public String getUsername() {
        return name;
    }

    public void setUsername(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Students{" +
                "username='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
