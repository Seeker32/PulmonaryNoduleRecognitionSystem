package com.seeker32.pulmonarynodulerecognitionsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seeker32.pulmonarynodulerecognitionsystem.model.entity.SystemLog;
import com.seeker32.pulmonarynodulerecognitionsystem.service.SystemLogService;
import com.seeker32.pulmonarynodulerecognitionsystem.mapper.SystemLogMapper;
import org.springframework.stereotype.Service;

/**
* @author senlin
* @description 针对表【system_log(系统操作审计日志)】的数据库操作Service实现
* @createDate 2025-03-18 22:21:15
*/
@Service
public class SystemLogServiceImpl extends ServiceImpl<SystemLogMapper, SystemLog>
    implements SystemLogService{

}




