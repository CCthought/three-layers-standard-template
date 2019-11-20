package com.adai.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouchengpei
 * date   2019/10/30 22:05
 * description .
 */
public class Student {
    private String username;
    private Integer age;
    private Integer height;
    private Byte sex;
    private String address;

    public Student() {
    }

    public Student(String username, Integer age, Integer height, Byte sex, String address) {
        this.username = username;
        this.age = age;
        this.height = height;
        this.sex = sex;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.clear();
        list.add("q");
        list.add("w");
        list.add("e");
        list.forEach(System.out::println);
    }
}
