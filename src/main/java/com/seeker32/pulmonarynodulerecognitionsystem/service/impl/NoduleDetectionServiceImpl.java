package com.seeker32.pulmonarynodulerecognitionsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seeker32.pulmonarynodulerecognitionsystem.model.entity.NoduleDetection;
import com.seeker32.pulmonarynodulerecognitionsystem.service.NoduleDetectionService;
import com.seeker32.pulmonarynodulerecognitionsystem.mapper.NoduleDetectionMapper;
import org.springframework.stereotype.Service;

/**
* @author senlin
* @description 针对表【nodule_detection(AI检测结果)】的数据库操作Service实现
* @createDate 2025-03-18 22:21:03
*/
@Service
public class NoduleDetectionServiceImpl extends ServiceImpl<NoduleDetectionMapper, NoduleDetection>
    implements NoduleDetectionService{

}




