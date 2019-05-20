package com.hw.service;

import com.hw.pojo.User;

import java.util.List;

/**
 * @param:
 * @Author: Administrator
 * @CreateTime: 2019-05-17 19:23
 */

public interface IUserService {

    List<User> findAll();
    Integer delete(User user);
}
