package com.example.zookeeper.service;/**
 * @author wj
 * @date 2022/3/23
 * @version 1.0
 */

import com.example.zookeeper.entity.User;

import java.util.List;

/**
 * @author wangjun
 * @create 2022-03-23
 * @desc 用户_service
 **/
public interface UserService {
    /**
     * 获取用户列表
     *
     * @return
     */
    List<User> getUserList();

    /**
     * 根据用户Id获取用户信息
     *
     * @param userId
     * @return
     */
    User getUserById(int userId);

    /**
     * 增加用户信息
     *
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    boolean modifyUser(User user);

    /**
     * 删除用户信息
     *
     * @param userId
     * @return
     */
    boolean deleteUser(int userId);

}
