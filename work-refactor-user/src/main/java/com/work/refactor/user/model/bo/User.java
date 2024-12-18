package com.work.refactor.user.model.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author mcqzht
 * @since 2024-12-18
 */
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("user_id")
    private Long userId;

    /**
     * 注册时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 用户昵称
     */
    @TableField("nick_name")
    private String nickName;

    /**
     * 头像图片路径
     */
    @TableField("pic")
    private String pic;

    /**
     * 状态 1 正常 0 无效
     */
    @TableField("status")
    private Integer status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
            "userId = " + userId +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
            ", nickName = " + nickName +
            ", pic = " + pic +
            ", status = " + status +
        "}";
    }
}
