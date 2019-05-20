package com.hw.mapper;

import com.hw.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @param:
 * @Author: Administrator
 * @CreateTime: 2019-05-17 19:10
 */
@Component
public interface IUserDao {


    @Transactional
    List<User> findAll();
//    @Transactional(propagation = Propagation.REQUIRED)
     Integer delete(User user);
}
