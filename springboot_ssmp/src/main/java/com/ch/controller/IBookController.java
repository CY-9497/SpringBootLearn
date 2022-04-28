package com.ch.controller;

import com.ch.pojo.Book;
import com.ch.service.IBookService;
import com.ch.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 渔郎
 * @CLassName IBookController
 * @Description TODO
 * @Date 2022/4/22 10:24
 */
@RestController
@RequestMapping("/books")
public class IBookController {
    private IBookService iBookService;
    @Autowired
    public void setiBookService(IBookService iBookService) {
        this.iBookService = iBookService;
    }

    @GetMapping
    public R getAll(){
        return new R(true,iBookService.list());
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, iBookService.getById(id));
    }
    @PostMapping
    public R save(@RequestBody Book book){
        System.out.println(book);
        return new R(iBookService.save(book));
    }
}
