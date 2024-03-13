package com.wang.controller;

import com.wang.entity.Student;
import com.wang.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/student")
public class StudentController {

    @Resource
    private IStudentService studentService;

    @RequestMapping("/find")
    public List<Student> find(Student stu){
        log.debug("stu="+stu);
        List<Student> list = studentService.findStudentByCondition(stu.getUsername(), stu.getPassword());
        log.debug("list:"+list);
        return list;

    }
}
