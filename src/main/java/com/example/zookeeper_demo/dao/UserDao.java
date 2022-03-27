package com.example.zookeeper_demo.dao;/**
 * @author wj
 * @date 2022/3/23
 * @version 1.0
 */

import com.example.zookeeper_demo.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author 15961
 * @create 2022-03-23 
 * @desc 用户——dao
 **/
//@Repository  //将这个mapper的bean注册到spring容器，不加也行
@Mapper  //标识这个类是一个数据访问层的bean，由spring容器管理
public interface UserDao {

    /**
     * 查询所有用户
     * @return
     */
    List<User> queryUser();

    /**
     * 根据用户Id查询用户
     * @param userId
     * @return
     */
    User queryUserById(int userId);

    /**
     * 增加用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    int deleteUser(int userId);
}
