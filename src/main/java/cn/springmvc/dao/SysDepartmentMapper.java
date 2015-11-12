/**
*SysDepartmentMapper.java
* Copyright(C) 2015 sinosoft
* All rights reserved.
* @Author : plc
*-------------------------------------
* @2015-10-30 Created
*/
package cn.springmvc.dao;

import cn.springmvc.model.SysDepartment;
import cn.springmvc.objModel.Criteria;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface SysDepartmentMapper {
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
    int insert(SysDepartment record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(SysDepartment record);

    /**
     * 根据条件查询记录集
     */
    List<SysDepartment> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    SysDepartment selectByPrimaryKey(String fdObjectid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") SysDepartment record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") SysDepartment record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SysDepartment record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SysDepartment record);
}