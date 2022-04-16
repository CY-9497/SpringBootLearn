package com.ch.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ch.pojo.Students;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 青梅君
 */
@Mapper
public interface UserDao extends BaseMapper<Students> {
}
