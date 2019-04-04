package com.box.cloud.cloudBox.dao.sys;

import com.box.cloud.cloudBox.model.sys.SysRole;

public interface SysRoleMapper {
    /**
     *
     * @mbggenerated 2018-05-25
     */
    int deleteByPrimaryKey(Long roleId);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int insert(SysRole record);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int insertSelective(SysRole record);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    SysRole selectByPrimaryKey(Long roleId);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int updateByPrimaryKey(SysRole record);
}