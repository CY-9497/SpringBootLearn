package com.ch.controller;

import com.ch.pojo.Book;
import com.ch.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 渔郎
 * @CLassName com.ch.controller.BookController
 * @Description TODO
 * @Date 2022/4/18 15:27
 */
@RestController
@RequestMapping("/book")
public class BookController {

    private IBookService iBookService;

    @Autowired
    public void setiBookService(IBookService iBookService) {
        this.iBookService = iBookService;
    }


    @GetMapping
    public List<Book> getAll() {
        return iBookService.list();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return iBookService.getById(id);
    }

    @PostMapping
    public Boolean save(@RequestBody Book book) {
        return iBookService.save(book);
    }
}
