package com.adai.controller;

import com.adai.service.IFirstService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhouchengpei
 * date   2019/8/13 16:55
 * description .
 */
@RestController
public class FirstController {
    @Resource
    private IFirstService firstService;

    @RequestMapping("/hello")
    public String hello(){
        return firstService.insert() + "hello";
    }
}
