package com.seeker32.pulmonarynodulerecognitionsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seeker32.pulmonarynodulerecognitionsystem.model.entity.UserPermission;
import com.seeker32.pulmonarynodulerecognitionsystem.service.UserPermissionService;
import com.seeker32.pulmonarynodulerecognitionsystem.mapper.UserPermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author senlin
* @description 针对表【user_permission(用户权限管理)】的数据库操作Service实现
* @createDate 2025-03-18 22:21:20
*/
@Service
public class UserPermissionServiceImpl extends ServiceImpl<UserPermissionMapper, UserPermission>
    implements UserPermissionService{

}




