package com.adai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhouchengpei
 * date   2019/8/13 17:00
 * description .
 */
@SpringBootApplication
@MapperScan("com.adai.dao")
public class FirstApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);
    }
}
