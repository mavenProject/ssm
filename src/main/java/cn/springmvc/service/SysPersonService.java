package cn.springmvc.service;

import cn.springmvc.model.SysPerson;
import cn.springmvc.objModel.Criteria;

import java.util.List;

public interface SysPersonService {
    int countByExample(Criteria example);

    SysPerson selectByPrimaryKey(String fdObjectid);

    List<SysPerson> selectByExample(Criteria example);

    int deleteByPrimaryKey(String fdObjectid);

    int updateByPrimaryKeySelective(SysPerson record);

    int updateByPrimaryKey(SysPerson record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(SysPerson record, Criteria example);

    int updateByExample(SysPerson record, Criteria example);

    int insert(SysPerson record);

    int insertSelective(SysPerson record);
}