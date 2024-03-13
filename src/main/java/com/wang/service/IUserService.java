package com.wang.service;

import com.wang.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserService {
    User findUserById(Integer id);

}
