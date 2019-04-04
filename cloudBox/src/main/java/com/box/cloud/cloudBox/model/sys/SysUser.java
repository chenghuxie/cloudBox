package com.box.cloud.cloudBox.model.sys;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SysUser {
    /**
     * 
     */
    private Long userId;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String email;

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
     * @return user_name 
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName 
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 
     * @return password 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 
     * @return email 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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