package com.adai.dao;

import com.adai.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhouchengpei
 * date   2019/8/13 16:55
 * description .
 */
public interface FirstDao {
    /**
     * 测试
     * @return .
     */
    Integer insert(@Param("studentList") List<Student> student);

    /**
     * 查找
     * @return .
     */
    String select();

}
