package com.box.cloud.cloudBox.model.sys;

import java.util.Date;

public class SysRole {
    /**
     * 
     */
    private Long roleId;

    /**
     * 
     */
    private Long userId;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Long createUser;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Long updateUser;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     * @return role_id 
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 
     * @param roleId 
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 
     * @return user_id 
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return create_user 
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 
     * @param createUser 
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return update_user 
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * 
     * @param updateUser 
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 
     * @return update_time 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}