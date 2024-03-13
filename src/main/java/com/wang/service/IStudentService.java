package com.wang.service;

import com.wang.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IStudentService {
    List<Student> findStudentByCondition(String username, String password);
}
