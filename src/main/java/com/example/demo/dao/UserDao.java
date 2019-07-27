package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;

public interface UserDao {
   public Integer reovme(@Param("id") Integer id);
}
