package com.seeker32.pulmonarynodulerecognitionsystem.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 结节形态特征分类
 * @TableName nodule_type
 */
@TableName(value ="nodule_type")
@Data
public class NoduleType {
    /**
     * 类型ID
     */
    @TableId(type = IdType.AUTO)
    private Integer typeId;

    /**
     * 关联检测结果ID
     */
    private Integer detectionId;

    /**
     * 结节类型
     */
    private String category;

    /**
     * 是否钙化
     */
    private Integer calcification;

    /**
     * 是否分叶征
     */
    private Integer lobulation;

    /**
     * 是否毛刺征
     */
    private Integer spiculation;

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