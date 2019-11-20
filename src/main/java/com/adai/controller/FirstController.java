package com.adai.controller;

import com.adai.dao.FirstDao;
import com.adai.pojo.Student;
import com.adai.service.IFirstService;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouchengpei
 * date   2019/8/13 16:55
 * description .
 */
@RestController
public class FirstController {
    @Resource
    private IFirstService firstService;

    @Resource
    private FirstDao firstDao;

    @Resource
    private TransactionTemplate transactionTemplate;

    @RequestMapping("/hello")
    public String hello() {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        student.setUsername("adai");

        Student student2 = new Student();
        student2.setUsername("apei");

        Student student3 = new Student();
        student3.setUsername("good morning");

        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);

        List<Student> students = studentList.subList(0, 2);
        Integer result = firstDao.batchInsert(students);
        return result + "";
    }
}
