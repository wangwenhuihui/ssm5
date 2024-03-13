package com.wang.mapper;

import com.wang.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IStudentMapper {
    List<Student> findStudentByCondition(@Param("username") String username,@Param("password") String password);
}
