package com.ch.dao;

import com.ch.pojo.Students;
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
