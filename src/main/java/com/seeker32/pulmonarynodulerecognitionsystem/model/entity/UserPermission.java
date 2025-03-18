package com.seeker32.pulmonarynodulerecognitionsystem.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 用户权限管理
 * @TableName user_permission
 */
@TableName(value ="user_permission")
@Data
public class UserPermission {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer permissionId;

    /**
     * 用户角色
     */
    private String role;

    /**
     * 权限等级
     */
    private Integer accessLevel;

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