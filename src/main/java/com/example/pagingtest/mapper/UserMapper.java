package com.example.pagingtest.mapper;

import com.example.pagingtest.entity.User;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    Page<User> getUsers();
}
