package com.ch.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ch.dao.BookDao;
import com.ch.pojo.Book;
import com.ch.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 渔郎
 * @CLassName IBookServiceImpl
 * @Description TODO
 * @Date 2022/4/17 15:52
 */
@Service
public class IBookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
    private BookDao bookDao;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize, Book book) {
        LambdaQueryWrapper<Book> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(Strings.isNotEmpty(book.getType()), Book::getType, book.getType());
        queryWrapper.like(Strings.isNotEmpty(book.getName()), Book::getName, book.getName());
        queryWrapper.like(Strings.isNotEmpty(book.getDescription()), Book::getDescription, book.getDescription());

        IPage<Book> page = new Page<>(currentPage, pageSize);
        bookDao.selectPage(page, queryWrapper);
        return page;
    }
}
