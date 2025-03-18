package com.seeker32.pulmonarynodulerecognitionsystem.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 报告审核记录
 * @TableName audit_log
 */
@TableName(value ="audit_log")
@Data
public class AuditLog {
    /**
     * 审核ID
     */
    @TableId(type = IdType.AUTO)
    private Integer auditId;

    /**
     * 关联报告ID
     */
    private Integer reportId;

    /**
     * 审核医生ID
     */
    private Long reviewerId;

    /**
     * 审核结果 0-待审核 1-通过 2-拒绝
     */
    private Integer auditResult;

    /**
     * 审核意见
     */
    private String comment;

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