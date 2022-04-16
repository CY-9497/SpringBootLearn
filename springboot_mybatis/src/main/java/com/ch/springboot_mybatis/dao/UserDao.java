package com.ch.springboot_mybatis.dao;

import com.ch.springboot_mybatis.pojo.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 青梅君
 */
@Mapper
public interface UserDao {
    @Select("select * from students where name = #{s}")
    Students selectByName(String s);
}
