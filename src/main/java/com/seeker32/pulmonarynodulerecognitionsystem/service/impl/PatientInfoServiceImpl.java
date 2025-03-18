package com.seeker32.pulmonarynodulerecognitionsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seeker32.pulmonarynodulerecognitionsystem.model.entity.PatientInfo;
import com.seeker32.pulmonarynodulerecognitionsystem.service.PatientInfoService;
import com.seeker32.pulmonarynodulerecognitionsystem.mapper.PatientInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author senlin
* @description 针对表【patient_info(患者基本信息)】的数据库操作Service实现
* @createDate 2025-03-18 22:21:07
*/
@Service
public class PatientInfoServiceImpl extends ServiceImpl<PatientInfoMapper, PatientInfo>
    implements PatientInfoService{

}




