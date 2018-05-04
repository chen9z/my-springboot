package com.yclooper.myspringboot.service.impl;

import com.yclooper.myspringboot.dao.UserEntityMapper;
import com.yclooper.myspringboot.entity.UserEntity;
import com.yclooper.myspringboot.service.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chen on 2018/5/3.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Resource
    private UserEntityMapper userEntityMapper;
    @Override
    public UserEntity findUserById(Integer id) {
        UserEntity userEntity = userEntityMapper.selectByPrimaryKey(id);
        return userEntity;
    }
}