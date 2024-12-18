package com.work.refactor.auth.model.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 统一账户信息
 * </p>
 *
 * @author mcqzht
 * @since 2024-12-18
 */
@TableName("auth_account")
public class AuthAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 全平台用户唯一id
     */
    @TableId("uid")
    private Long uid;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 创建ip
     */
    @TableField("create_ip")
    private String createIp;

    /**
     * 状态 1:启用 0:禁用 -1:删除
     */
    @TableField("status")
    private Byte status;

    /**
     * 用户类型见SysTypeEnum 0.普通用户系统 1.商家端 2平台端
     */
    @TableField("sys_type")
    private Byte sysType;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 所属租户
     */
    @TableField("tenant_id")
    private Long tenantId;

    /**
     * 是否是管理员
     */
    @TableField("is_admin")
    private Byte isAdmin;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getSysType() {
        return sysType;
    }

    public void setSysType(Byte sysType) {
        this.sysType = sysType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Byte getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "AuthAccount{" +
            "uid = " + uid +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
            ", username = " + username +
            ", password = " + password +
            ", createIp = " + createIp +
            ", status = " + status +
            ", sysType = " + sysType +
            ", userId = " + userId +
            ", tenantId = " + tenantId +
            ", isAdmin = " + isAdmin +
        "}";
    }
}
