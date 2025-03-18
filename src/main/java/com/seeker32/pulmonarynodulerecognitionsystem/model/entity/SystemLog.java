package com.seeker32.pulmonarynodulerecognitionsystem.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 系统操作审计日志
 * @TableName system_log
 */
@TableName(value ="system_log")
@Data
public class SystemLog {
    /**
     * 日志ID
     */
    @TableId(type = IdType.AUTO)
    private Integer logId;

    /**
     * 操作人ID
     */
    private Long userId;

    /**
     * 操作类型
     */
    private String actionType;

    /**
     * 目标表名
     */
    private String targetTable;

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