package com.mxf.blog.blog.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.mxf.blog.blog.entity.User;
import com.mxf.blog.blog.service.IUserService;
import com.mxf.blog.common.Response;
import com.mxf.blog.common.ResponseCode;
import com.mxf.blog.common.ResponseInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author fxz
 * @since 2019-11-06
 */
@RestController
@RequestMapping("/blog/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation("根据id获取用户")
    @PostMapping("findById")
    public Response<User> findById(@RequestParam Long id) {
        Wrapper<User> wrapper = new QueryWrapper<User>().eq("id", id);
        User user = userService.getOne(wrapper);

        return new Response<>(ResponseCode.SUCCESS, ResponseInfo.SUCCESS, user);


    }

}
