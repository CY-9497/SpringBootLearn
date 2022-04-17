package com.ch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ch.dao.BookDao;
import com.ch.pojo.Book;
import com.ch.service.IBookService;
import org.springframework.stereotype.Service;

/**
 * @author 渔郎
 * @CLassName IBookServiceImpl
 * @Description TODO
 * @Date 2022/4/17 15:52
 */
@Service
public class IBookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
}
