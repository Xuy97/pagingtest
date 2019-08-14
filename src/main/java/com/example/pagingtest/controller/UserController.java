package com.example.pagingtest.controller;

import com.example.pagingtest.entity.User;
import com.example.pagingtest.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/test")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/users")
    @ResponseBody
    public PageInfo<User> lists(@RequestParam(defaultValue = "1") int pageNo,
                                @RequestParam(defaultValue = "10") int pageSize) {
        System.out.println("xxxx");
        return userService.getusers(pageNo,pageSize);
    }

    @GetMapping("/userss")
    @ResponseBody
    public List<User> listss(@RequestParam(defaultValue = "1") int pageNo,
                                @RequestParam(defaultValue = "10") int pageSize) {
        System.out.println("xxxx--------------------->");
        return userService.getUsers(pageNo,pageSize);
    }

}
