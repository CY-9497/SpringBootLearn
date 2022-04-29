package com.ch.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
        boolean flag = iBookService.save(book);
        return new R(flag,flag?"添加成功^_^":"添加失败-_-!");
    }

    @DeleteMapping("/{id}")
    public R removeById(@PathVariable Integer id){
        boolean flag = iBookService.removeById(id);
        return new R(flag,flag?"删除成功^_^":"删除失败-_-!");
    }

    @PutMapping
    public R updateById(@RequestBody Book book){
        boolean flag = iBookService.updateById(book);
        return new R(flag,flag?"修改成功^_^":"修改失败-_-!");
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize){
        Page<Book> page = new Page<>(currentPage,pageSize);
        return new R(true, iBookService.page(page));
    }
}
