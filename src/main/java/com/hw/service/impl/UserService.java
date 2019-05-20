package com.hw.service.impl;

import com.hw.mapper.IUserDao;
import com.hw.pojo.User;
import com.hw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param:
 * @Author: Administrator
 * @CreateTime: 2019-05-17 19:24
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;
    public List<User> findAll() {
        return userDao.findAll();
    }

    public Integer delete(User user) {
        return userDao.delete(user);
    }


}
