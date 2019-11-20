package com.adai.service.impl;

import com.adai.pojo.Student;
import com.adai.dao.FirstDao;
import com.adai.service.IFirstService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouchengpei
 * date   2019/8/13 16:56
 * description .
 */
@Service
public class FirstServiceImpl implements IFirstService {

    @Resource
    private FirstDao firstDao;

    @Override
    public Integer batchInsert(List<Student> student) {
        return firstDao.batchInsert(student);
    }

    @Override
    public Integer insertSingle(Student student) {
        return firstDao.insertSingle(student);
    }

    @Override
    public Integer insertStatic() {
        return firstDao.insertStatic();
    }

    @Override
    public Integer updateStatic(String username) {
        return firstDao.updateStatic(username);
    }

    @Override
    public List<Student> selectAll() {
        return firstDao.selectAll();
    }

}
