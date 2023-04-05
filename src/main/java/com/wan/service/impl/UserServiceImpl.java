package com.wan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wan.entity.User;
import com.wan.service.UserService;
import com.wan.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author moxinxin
* @description 针对表【user(用户信息)】的数据库操作Service实现
* @createDate 2023-04-01 23:48:13
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




