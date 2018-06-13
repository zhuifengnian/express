package com.express.service.impl;

import com.express.basic.Page;
import com.express.mapper.BaseMapper;
import com.express.mapper.ExpressMapper;
import com.express.model.Express;
import com.express.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <br/>
 * fan 2018/6/13 10:54
 */
@Service
public class ExpressServiceImpl extends AbstractBaseServiceImpl<Express> implements ExpressService {
    @Autowired
    private ExpressMapper expressMapper;
    @Override
    public BaseMapper<Express> getDao() {
        return expressMapper;
    }
}