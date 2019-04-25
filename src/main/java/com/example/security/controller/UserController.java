package com.example.security.controller;

import com.example.security.entity.User;
import com.example.security.service.UserService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 个人中心
     */
    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("/index")
    public String index() {
        return "user/index";
    }

    /**
     * 用户信息
     */
    @RequestMapping(value = "/{username}")
    @ResponseBody
    public User getUser(@PathVariable String username) {
        User user = userService.findUserByUsername(username);
        return user;
    }

}
