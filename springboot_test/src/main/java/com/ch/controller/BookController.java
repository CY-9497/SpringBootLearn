package com.ch.controller;

import com.ch.pojo.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 渔郎
 * @Date 2022/5/3 18:00
 * @return
 */
@RestController
@RequestMapping("/books")
public class BookController {

//    @GetMapping
//    public String getById(){
//        System.out.println("running....");
//        return "springboot";
//    }

    @GetMapping
    public Book getById(){
        Book book = new Book();
        book.setId(1);
        book.setName("springboot");
        book.setType("springboot");
        book.setDescription("spring");

        return book;
    }

}
