package com.mxf.blog.blog.service.impl;

import com.mxf.blog.blog.entity.User;
import com.mxf.blog.blog.mapper.UserMapper;
import com.mxf.blog.blog.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fxz
 * @since 2019-11-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
