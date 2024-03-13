package com.wang.controller;

import com.wang.entity.User;
import com.wang.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/userController")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/findUserById/{id}")
    public User findUserById(@PathVariable Integer id){
        log.debug("id="+id);
        User user = userService.findUserById(id);
        log.debug("user="+user);
        return user;
    }
}
