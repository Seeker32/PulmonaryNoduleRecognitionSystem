package com.seeker32.pulmonarynodulerecognitionsystem.service;

import com.seeker32.pulmonarynodulerecognitionsystem.model.dto.user.UserRegisterRequest;
import com.seeker32.pulmonarynodulerecognitionsystem.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Seeker32
* @description 针对表【user(用户信息)】的数据库操作Service
* @createDate 2025-03-19 10:29:17
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userRegisterRequest
     * @return
     */
    Long registerUser(UserRegisterRequest userRegisterRequest);
}
