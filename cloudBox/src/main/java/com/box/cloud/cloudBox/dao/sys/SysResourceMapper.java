package com.box.cloud.cloudBox.dao.sys;

import com.box.cloud.cloudBox.model.sys.SysResource;

public interface SysResourceMapper {
    /**
     *
     * @mbggenerated 2018-05-25
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int insert(SysResource record);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int insertSelective(SysResource record);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    SysResource selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int updateByPrimaryKeySelective(SysResource record);

    /**
     *
     * @mbggenerated 2018-05-25
     */
    int updateByPrimaryKey(SysResource record);
}