package com.seeker32.pulmonarynodulerecognitionsystem.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 医生诊断报告
 * @TableName diagnosis_report
 */
@TableName(value ="diagnosis_report")
@Data
public class DiagnosisReport {
    /**
     * 报告ID
     */
    @TableId(type = IdType.AUTO)
    private Integer reportId;

    /**
     * 患者ID
     */
    private Integer patientId;

    /**
     * 影像ID
     */
    private Integer imageId;

    /**
     * 医生ID
     */
    private Long userId;

    /**
     * 诊断结论
     */
    private String conclusion;

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