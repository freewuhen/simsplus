package com.freeyun.simsplus.controller;

import com.freeyun.simsplus.dao.domain.Student;
import com.freeyun.simsplus.dao.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired private StudentMapper studentMapper;
    @GetMapping("/")
    public Student getStudentInfo()//@RequestParam String sno)
    {
        String sno = "20170302001";
        return studentMapper.select(sno);
    }
}
