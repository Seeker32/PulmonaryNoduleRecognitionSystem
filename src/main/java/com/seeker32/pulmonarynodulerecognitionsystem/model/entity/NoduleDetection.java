package com.seeker32.pulmonarynodulerecognitionsystem.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * AI检测结果
 * @TableName nodule_detection
 */
@TableName(value ="nodule_detection")
@Data
public class NoduleDetection {
    /**
     * 检测记录ID
     */
    @TableId(type = IdType.AUTO)
    private Integer detectionId;

    /**
     * 关联影像ID
     */
    private Integer imageId;

    /**
     * 切片序号
     */
    private Integer sliceIndex;

    /**
     * 恶性概率
     */
    private Integer malignancyProb;

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