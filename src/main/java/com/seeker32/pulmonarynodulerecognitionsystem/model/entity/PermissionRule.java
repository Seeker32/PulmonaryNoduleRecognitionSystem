package com.seeker32.pulmonarynodulerecognitionsystem.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 权限规则表
 * @TableName permission_rule
 */
@TableName(value ="permission_rule")
@Data
public class PermissionRule {
    /**
     * 规则ID
     */
    @TableId(type = IdType.AUTO)
    private Integer ruleId;

    /**
     * 关联角色
     */
    private String role;

    /**
     * 要求的最低权限等级
     */
    private Integer minAccessLevel;

    /**
     * 操作资源（如patient_info）
     */
    private String resource;

    /**
     * 操作类型（SELECT/INSERT/UPDATE/DELETE）
     */
    private String action;

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