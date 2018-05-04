package com.yclooper.myspringboot.controller;

import com.yclooper.myspringboot.core.ret.Response;
import com.yclooper.myspringboot.core.ret.Result;
import com.yclooper.myspringboot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by chen on 2018/4/28.
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("/hello")
    private Result hello() throws Exception{
        return Response.makeOKRsp(userService.findUserById(1));
    }



}
