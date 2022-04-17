package com.ch.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ch.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 青梅君
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
