package com.example.zookeeper.entity;/**
 * @author wj
 * @date 2022/3/23
 * @version 1.0
 */

/**
 * @author wangjun
 * @create 2022-03-23
 * @desc 用户表
 **/
public class User {

    //主键，唯一识别Id
    private Integer userId;

    //姓名
    private String userName;

    //年龄
    private Integer age;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
