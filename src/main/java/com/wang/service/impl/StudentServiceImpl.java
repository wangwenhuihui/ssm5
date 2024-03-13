package com.wang.service.impl;

import com.wang.entity.Student;
import com.wang.mapper.IStudentMapper;
import com.wang.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Resource
    private IStudentMapper studentMapper;

    @Override
    public List<Student> findStudentByCondition(String username, String password) {
        return studentMapper.findStudentByCondition(username,password);
    }
}
