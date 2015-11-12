package cn.springmvc.service;

import cn.springmvc.model.Criteria;
import cn.springmvc.model.SysUserInfo;
import java.util.List;

public interface SysUserInfoService {
    int countByExample(Criteria example);

    SysUserInfo selectByPrimaryKey(String fdObjectid);

    List<SysUserInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String fdObjectid);

    int updateByPrimaryKeySelective(SysUserInfo record);

    int updateByPrimaryKey(SysUserInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(SysUserInfo record, Criteria example);

    int updateByExample(SysUserInfo record, Criteria example);

    int insert(SysUserInfo record);

    int insertSelective(SysUserInfo record);
}