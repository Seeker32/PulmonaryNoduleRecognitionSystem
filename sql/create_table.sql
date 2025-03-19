create database if not exists pulmonary_nodule_recognition;

use pulmonary_nodule_recognition;

-- 患者信息表
CREATE TABLE if not exists patient_info (
    patient_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '患者唯一标识',
    name VARCHAR(50) NOT NULL COMMENT '姓名',
    gender CHAR(1) NULL COMMENT '性别',
    age INT NULL COMMENT '年龄',
    contact VARCHAR(20) NULL COMMENT '联系方式',
    create_time datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete tinyint default 0 not null comment '是否删除',
    INDEX idx_name (name),
    INDEX idx_gender_age (gender, age)
) COMMENT '患者基本信息';

-- 影像记录表
CREATE TABLE if not exists image_record (
    image_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '影像唯一标识',
    patient_id INT NOT NULL COMMENT '关联患者ID',
    scan_time DATETIME NOT NULL COMMENT '扫描时间',
    device_model VARCHAR(50) NULL COMMENT '设备型号',
    storage_path VARCHAR(200) NOT NULL COMMENT '存储路径',
    create_time datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete tinyint default 0 not null comment '是否删除',
    INDEX idx_patient_id (patient_id),
    INDEX idx_scan_time (scan_time),
    INDEX idx_device (device_model)
) COMMENT 'CT影像元数据';

-- 肺结节检测结果表
CREATE TABLE if not exists nodule_detection (
    detection_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '检测记录ID',
    image_id INT NOT NULL COMMENT '关联影像ID',
    slice_index INT NOT NULL COMMENT '切片序号',
    malignancy_prob TINYINT NULL COMMENT '恶性概率',
    create_time datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete tinyint default 0 not null comment '是否删除',
    INDEX idx_image_slice (image_id, slice_index),
    INDEX idx_malignancy (malignancy_prob)
) COMMENT 'AI检测结果';

-- 用户信息表
CREATE TABLE if not exists doctor_info (
    user_id BIGINT PRIMARY KEY COMMENT 'ID',
    user_name VARCHAR(50) NOT NULL COMMENT '姓名',
    user_phone varchar(50) NOT NULL COMMENT '手机号',
    user_password varchar(512) NOT NULL COMMENT '密码',
    user_avatar varchar(1024) NULL comment '用户头像',
    user_role varchar(256) default 'doctor' not null comment '用户角色 doctor/senior_doctor/admin',
    create_time datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete tinyint default 0 not null comment '是否删除',
    UNIQUE KEY uk_user_phone (user_phone)
) COMMENT '用户信息';

-- 诊断报告表
CREATE TABLE if not exists diagnosis_report (
    report_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '报告ID',
    patient_id INT NOT NULL COMMENT '患者ID',
    image_id INT NOT NULL COMMENT '影像ID',
    user_id BIGINT NOT NULL COMMENT '医生ID',
    conclusion VARCHAR(1024) NULL COMMENT '诊断结论',
    create_time datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete tinyint default 0 not null comment '是否删除',
    INDEX idx_patient_create (patient_id, create_time),
    INDEX idx_user_create (user_id, create_time),
    INDEX idx_image_report (image_id)
) COMMENT '医生诊断报告';

-- 审核记录表
CREATE TABLE if not exists audit_log (
    audit_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '审核ID',
    report_id INT NOT NULL COMMENT '关联报告ID',
    reviewer_id BIGINT NOT NULL COMMENT '审核医生ID',
    audit_result INT NOT NULL COMMENT '审核结果 0-待审核 1-通过 2-拒绝',
    comment VARCHAR(1024) NULL COMMENT '审核意见',
    create_time datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete tinyint default 0 not null comment '是否删除',
    INDEX idx_report_audit (report_id),
    INDEX idx_reviewer (reviewer_id),
    INDEX idx_audit_result (audit_result)
) COMMENT '报告审核记录';

-- 结节类型标签表
CREATE TABLE if not exists nodule_type (
     type_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '类型ID',
     detection_id INT NOT NULL COMMENT '关联检测结果ID',
     category VARCHAR(20) NOT NULL COMMENT '结节类型',
     calcification TINYINT(1) DEFAULT 0 COMMENT '是否钙化',
     lobulation TINYINT(1) DEFAULT 0 COMMENT '是否分叶征',
     spiculation TINYINT(1) DEFAULT 0 COMMENT '是否毛刺征',
     create_time datetime default CURRENT_TIMESTAMP not null comment '创建时间',
     update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
     is_delete tinyint default 0 not null comment '是否删除',
     INDEX idx_detection (detection_id),
     INDEX idx_category (category),
     INDEX idx_features (calcification, lobulation, spiculation)
) COMMENT '结节形态特征分类';

-- 系统操作日志表
CREATE TABLE if not exists system_log (
    log_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '日志ID',
    user_id BIGINT NOT NULL COMMENT '操作人ID',
    action_type VARCHAR(20) NOT NULL COMMENT '操作类型',
    target_table VARCHAR(50) NOT NULL COMMENT '目标表名',
    create_time datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete tinyint default 0 not null comment '是否删除',
    INDEX idx_user_action (user_id, action_type),
    INDEX idx_create_time (create_time),
    INDEX idx_target_table (target_table)
) COMMENT '系统操作审计日志';

-- 用户权限表
CREATE TABLE if not exists user_permission (
     permission_id INT PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
     role VARCHAR(256) NOT NULL COMMENT '用户角色',
     access_level INT NOT NULL COMMENT '权限等级',
     create_time datetime default CURRENT_TIMESTAMP not null comment '创建时间',
     update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
     is_delete tinyint default 0 not null comment '是否删除',
     INDEX idx_role_access (role, access_level)
) COMMENT '用户权限管理';

-- 权限规则表
CREATE TABLE IF NOT EXISTS permission_rule (
   rule_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '规则ID',
   role VARCHAR(256) NOT NULL COMMENT '关联角色',
   min_access_level INT NOT NULL COMMENT '要求的最低权限等级',
   resource VARCHAR(50) NOT NULL COMMENT '操作资源（如patient_info）',
   action VARCHAR(20) NOT NULL COMMENT '操作类型（SELECT/INSERT/UPDATE/DELETE）',
   create_time datetime default CURRENT_TIMESTAMP not null comment '创建时间',
   update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
   is_delete tinyint default 0 not null comment '是否删除',
   INDEX idx_role_resource (role, resource)
) COMMENT '权限规则表';

ALTER TABLE doctor_info RENAME TO user;