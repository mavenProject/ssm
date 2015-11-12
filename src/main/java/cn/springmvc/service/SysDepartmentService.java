package cn.springmvc.service;

import cn.springmvc.model.SysDepartment;
import cn.springmvc.objModel.Criteria;

import java.util.List;

public interface SysDepartmentService {
    int countByExample(Criteria example);

    SysDepartment selectByPrimaryKey(String fdObjectid);

    List<SysDepartment> selectByExample(Criteria example);

    int deleteByPrimaryKey(String fdObjectid);

    int updateByPrimaryKeySelective(SysDepartment record);

    int updateByPrimaryKey(SysDepartment record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(SysDepartment record, Criteria example);

    int updateByExample(SysDepartment record, Criteria example);

    int insert(SysDepartment record);

    int insertSelective(SysDepartment record);
}