package com.adai.service;

import com.adai.pojo.Student;

import java.util.List;

/**
 * @author zhouchengpei
 * date   2019/8/13 16:56
 * description .
 */
public interface IFirstService {

    /**
     * 批量插入
     *
     * @param student student数据集合
     * @return 修改的行数
     */
    Integer batchInsert(List<Student> student);

    /**
     * 单条插入
     *
     * @param student 数据实体
     * @return 修改的行数 0 或 1
     */
    Integer insertSingle(Student student);

    /**
     * 静态插入 xml中的数据已经写死
     *
     * @return 修改的行数 固定为1 除非出错
     */
    Integer insertStatic();

    /**
     * 静态更新 固定更新ID最小的哪一个，需要更新的值就是username
     *
     * @param username 更新后的值
     * @return 修改的行数 0 或 1
     */
    Integer updateStatic(String username);

    /**
     * 无条件 集合查询
     *
     * @return Student 实体集合
     */
    List<Student> selectAll();


}
