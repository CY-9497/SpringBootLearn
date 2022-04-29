package com.ch.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ch.pojo.Book;

/**
 * @author 青梅君
 */
public interface IBookService extends IService<Book> {
    /**
     *
     * 获取分页信息
     * @param currentPage 当前页
     * @param pageSize 页数
     * @param book 实体
     * @return 集合
     */
    IPage<Book> getPage(int currentPage, int pageSize, Book book);

}
