package com.example.pagingtest.service;

import com.example.pagingtest.entity.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

public interface UserService {
    Page<User> getUsers(int pageNo,int pageSize);
    PageInfo<User> getusers(int pageNo,int pageSize);
}
