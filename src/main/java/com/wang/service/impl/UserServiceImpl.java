package com.wang.service.impl;

import com.wang.entity.User;
import com.wang.mapper.IUserMapper;
import com.wang.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserMapper userMapper;

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }
}
