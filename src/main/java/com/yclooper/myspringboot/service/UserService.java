package com.yclooper.myspringboot.service;

import com.yclooper.myspringboot.entity.UserEntity;

/**
 * Created by chen on 2018/5/3.
 */
public interface UserService {
    UserEntity findUserById(Integer id);
}
