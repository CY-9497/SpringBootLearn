package com.ch.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ch.pojo.Book;

import java.util.List;

/**
 * @author 青梅君
 */
public interface BookService {
    Boolean save(Book book);

    Boolean update(Book book);

    Boolean delete(Integer id);

    Book getById(Integer id);

    List<Book> getAll();

    Page<Book> getPage(int currentPage, int pageSize);

    List<Book> getByName(String name);
}
