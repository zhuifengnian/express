package com.express.service.impl;

import com.express.basic.Page;
import com.express.mapper.BaseMapper;
import com.express.mapper.UserMapper;
import com.express.model.User;
import com.express.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <br/>
 * fan 2018/6/13 10:56
 */
@Service
public class UserServiceImpl extends AbstractBaseServiceImpl<User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public BaseMapper<User> getDao() {
        return userMapper;
    }
}