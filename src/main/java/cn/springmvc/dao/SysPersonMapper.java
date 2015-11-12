/**
*SysPersonMapper.java
* Copyright(C) 2015 sinosoft
* All rights reserved.
* @Author : plc
*-------------------------------------
* @2015-10-30 Created
*/
package cn.springmvc.dao;

import cn.springmvc.model.SysPerson;
import cn.springmvc.objModel.Criteria;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface SysPersonMapper {
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
    int insert(SysPerson record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(SysPerson record);

    /**
     * 根据条件查询记录集
     */
    List<SysPerson> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    SysPerson selectByPrimaryKey(String fdObjectid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") SysPerson record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") SysPerson record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SysPerson record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SysPerson record);
}