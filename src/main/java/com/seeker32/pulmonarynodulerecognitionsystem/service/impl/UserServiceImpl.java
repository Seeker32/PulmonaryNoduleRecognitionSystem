package com.seeker32.pulmonarynodulerecognitionsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seeker32.pulmonarynodulerecognitionsystem.model.dto.user.UserRegisterRequest;
import com.seeker32.pulmonarynodulerecognitionsystem.model.entity.User;
import com.seeker32.pulmonarynodulerecognitionsystem.service.UserService;
import com.seeker32.pulmonarynodulerecognitionsystem.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Seeker32
* @description 针对表【user(用户信息)】的数据库操作Service实现
* @createDate 2025-03-19 10:29:17
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Override
    public Long registerUser(UserRegisterRequest userRegisterRequest) {
        return 0L;
    }
}




