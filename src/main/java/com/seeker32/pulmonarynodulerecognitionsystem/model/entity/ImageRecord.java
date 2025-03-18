package com.seeker32.pulmonarynodulerecognitionsystem.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * CT影像元数据
 * @TableName image_record
 */
@TableName(value ="image_record")
@Data
public class ImageRecord {
    /**
     * 影像唯一标识
     */
    @TableId(type = IdType.AUTO)
    private Integer imageId;

    /**
     * 关联患者ID
     */
    private Integer patientId;

    /**
     * 扫描时间
     */
    private Date scanTime;

    /**
     * 设备型号
     */
    private String deviceModel;

    /**
     * 存储路径
     */
    private String storagePath;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;
}