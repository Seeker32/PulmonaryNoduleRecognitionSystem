package com.seeker32.pulmonarynodulerecognitionsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seeker32.pulmonarynodulerecognitionsystem.model.entity.ImageRecord;
import com.seeker32.pulmonarynodulerecognitionsystem.service.ImageRecordService;
import com.seeker32.pulmonarynodulerecognitionsystem.mapper.ImageRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author senlin
* @description 针对表【image_record(CT影像元数据)】的数据库操作Service实现
* @createDate 2025-03-18 22:21:00
*/
@Service
public class ImageRecordServiceImpl extends ServiceImpl<ImageRecordMapper, ImageRecord>
    implements ImageRecordService{

}




