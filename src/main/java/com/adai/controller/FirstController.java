package com.adai.controller;

import com.adai.Student;
import com.adai.dao.FirstDao;
import com.adai.service.IFirstService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

    private static final String[] names = {"刘德华", "周杰伦", "张三丰", "诸葛亮", "司马懿", "呆头", "张学友", "爱德华", "火星", "太阳"};
    private static final Integer[] ages = {21, 31, 41, 51, 61, 71, 81, 91, 100, 101};
    private static final Integer[] heights = {170, 171, 181, 182, 190, 168, 173, 175, 199, 220};
    private static final Byte[] sexs = {0, 1};
    private static final String[] address = {"中国上海大连西路550号",
            "国北京市朝阳区大山子A东里小区23栋3单元7楼",
            "第五宇宙", "第七宇宙恒星所在处", "浪迹天涯", "太阳背面", "大海最低处", "四姑凉山", "秦岭", "长城"};

    private static final Integer NUMBER = 4500;

    @RequestMapping("/hello")
    public String hello() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/adai?rewriteBatchedStatements=true&characterEncoding=UTF8&useUnicode=true";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "insert into student(`username`,`age`,`height`,`sex`,`address`,`create_time`,`update_time`) values(?,?,?,?,?,now(),null)";
        List<Student> studentlist = new ArrayList<>();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < NUMBER; i++) {
            for (int j = 0; j < 10; j++) {
                String name = names[j] + i;
                int age = ages[j] + i;
                int height = heights[j] + i;
                Byte sex = sexs[0];
                String addre = address[j] + i;
                Student student = new Student();
                student.setUsername(name);
                student.setAge(age);
                student.setHeight(height);
                student.setSex(sex);
                student.setAddress(addre);
                studentlist.add(student);
            }
        }
        firstDao.insert(studentlist);
        long end = System.currentTimeMillis();
        System.out.println("相差时间 " + (end - begin));
        return "success";
    }
}
