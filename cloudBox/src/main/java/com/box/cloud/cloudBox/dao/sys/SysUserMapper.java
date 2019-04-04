package com.box.cloud.cloudBox.dao.sys;

import com.box.cloud.cloudBox.model.sys.SysUser;

public interface SysUserMapper {
    /**
     *
     * @mbggenerated 2018-05-25
     */
    int deleteByPrimaryKey(Long userId);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int insert(SysUser record);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int insertSelective(SysUser record);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    SysUser selectByPrimaryKey(Long userId);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int updateByPrimaryKey(SysUser record);
}