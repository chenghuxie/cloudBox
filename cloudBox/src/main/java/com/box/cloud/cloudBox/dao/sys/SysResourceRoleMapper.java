package com.box.cloud.cloudBox.dao.sys;

import com.box.cloud.cloudBox.model.sys.SysResourceRole;

public interface SysResourceRoleMapper {
    /**
     *
     * @mbggenerated 2018-05-25
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int insert(SysResourceRole record);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int insertSelective(SysResourceRole record);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    SysResourceRole selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int updateByPrimaryKeySelective(SysResourceRole record);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int updateByPrimaryKey(SysResourceRole record);
}