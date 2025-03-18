package com.seeker32.pulmonarynodulerecognitionsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seeker32.pulmonarynodulerecognitionsystem.model.entity.NoduleType;
import com.seeker32.pulmonarynodulerecognitionsystem.service.NoduleTypeService;
import com.seeker32.pulmonarynodulerecognitionsystem.mapper.NoduleTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author senlin
* @description 针对表【nodule_type(结节形态特征分类)】的数据库操作Service实现
* @createDate 2025-03-18 22:21:05
*/
@Service
public class NoduleTypeServiceImpl extends ServiceImpl<NoduleTypeMapper, NoduleType>
    implements NoduleTypeService{

}




