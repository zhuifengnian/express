package com.express.service.impl;

import com.express.mapper.BaseMapper;
import com.express.mapper.UserExpressMapper;
import com.express.model.UserExpress;
import com.express.service.UserExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <br/>
 * fan 2018/6/13 10:58
 */
@Service
public class UserExpressServiceImpl extends AbstractBaseServiceImpl<UserExpress> implements UserExpressService {
    @Autowired
    private UserExpressMapper userExpressMapper;
    @Override
    public BaseMapper<UserExpress> getDao() {
        return userExpressMapper;
    }
}