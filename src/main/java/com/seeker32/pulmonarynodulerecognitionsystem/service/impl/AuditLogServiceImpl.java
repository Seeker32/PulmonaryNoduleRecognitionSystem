package com.seeker32.pulmonarynodulerecognitionsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seeker32.pulmonarynodulerecognitionsystem.model.entity.AuditLog;
import com.seeker32.pulmonarynodulerecognitionsystem.service.AuditLogService;
import com.seeker32.pulmonarynodulerecognitionsystem.mapper.AuditLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Seeker32
* @description 针对表【audit_log(报告审核记录)】的数据库操作Service实现
* @createDate 2025-03-18 22:19:57
*/
@Service
public class AuditLogServiceImpl extends ServiceImpl<AuditLogMapper, AuditLog>
    implements AuditLogService{

}




