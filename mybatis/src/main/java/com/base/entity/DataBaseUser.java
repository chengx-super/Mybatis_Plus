package com.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Chengx
 * @since 2019-02-27
 */
@Data
@Accessors(chain = true)
@TableName("data_base_user")
public class DataBaseUser{

    private static final long serialVersionUID = 1L;

    /**
     * 用户code帐号用于登录
     */
    @TableField("userCode")
    private String userCode;

    /**
     * 用户密码
     */
    @TableField("userPwd")
    private String userPwd;

    /**
     * 用户状态 默认激活
     */
    @TableField("userStauts")
    private Integer userStauts;

    /**
     * 权限code,0代表无权限
     */
    @TableField("roleCode")
    private String roleCode;

    /**
     * 用户创建日期
     */
    @TableField("createTime")
    private LocalDateTime createTime;


}
