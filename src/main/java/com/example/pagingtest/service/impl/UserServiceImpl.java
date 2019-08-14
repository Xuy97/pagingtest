package com.example.pagingtest.service.impl;

import com.example.pagingtest.entity.User;
import com.example.pagingtest.mapper.UserMapper;
import com.example.pagingtest.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 1.5.*版本的
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public Page<User> getUsers(int pageNo,int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNo,pageSize);
        return userMapper.getUsers();
    }

    /**
     * 2.0以上的版本
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<User> getusers(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<User> userDomains = userMapper.getUsers();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }
}
