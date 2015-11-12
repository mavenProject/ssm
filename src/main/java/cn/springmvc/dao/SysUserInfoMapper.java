/**
*SysUserInfoMapper.java
* Copyright(C) 2015 sinosoft
* All rights reserved.
* @Author : plc
*-------------------------------------
* @2015-11-12 Created
*/
package cn.springmvc.dao;

import cn.springmvc.model.Criteria;
import cn.springmvc.model.SysUserInfo;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface SysUserInfoMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(Criteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(Criteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(String fdObjectid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(SysUserInfo record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(SysUserInfo record);

    /**
     * 根据条件查询记录集
     */
    List<SysUserInfo> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    SysUserInfo selectByPrimaryKey(String fdObjectid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") SysUserInfo record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") SysUserInfo record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SysUserInfo record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SysUserInfo record);
}