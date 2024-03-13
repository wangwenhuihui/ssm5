package com.wang.mapper;

import com.wang.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserMapper {
    User findUserById(@Param("id") Integer id);
}
