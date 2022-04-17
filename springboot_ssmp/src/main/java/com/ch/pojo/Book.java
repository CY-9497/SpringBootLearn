package com.ch.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 渔郎
 * @CLassName Book
 * @Description TODO
 * @Date 2022/4/17 9:57
 */
@Data
@TableName("tb_book")
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
