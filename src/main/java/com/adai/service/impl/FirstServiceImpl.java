package com.adai.service.impl;

import com.adai.dao.FirstDao;
import com.adai.service.IFirstService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    public Integer insert() {
        return firstDao.insert();
    }
}
