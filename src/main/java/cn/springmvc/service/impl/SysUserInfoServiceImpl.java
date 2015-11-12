package cn.springmvc.service.impl;

import cn.springmvc.dao.SysUserInfoMapper;
import cn.springmvc.model.Criteria;
import cn.springmvc.model.SysUserInfo;
import cn.springmvc.service.SysUserInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserInfoServiceImpl implements SysUserInfoService {
    @Autowired
    private SysUserInfoMapper sysUserInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(SysUserInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.sysUserInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public SysUserInfo selectByPrimaryKey(String fdObjectid) {
        return this.sysUserInfoMapper.selectByPrimaryKey(fdObjectid);
    }

    public List<SysUserInfo> selectByExample(Criteria example) {
        return this.sysUserInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String fdObjectid) {
        return this.sysUserInfoMapper.deleteByPrimaryKey(fdObjectid);
    }

    public int updateByPrimaryKeySelective(SysUserInfo record) {
        return this.sysUserInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysUserInfo record) {
        return this.sysUserInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.sysUserInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SysUserInfo record, Criteria example) {
        return this.sysUserInfoMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(SysUserInfo record, Criteria example) {
        return this.sysUserInfoMapper.updateByExample(record, example.getCondition());
    }

    public int insert(SysUserInfo record) {
        return this.sysUserInfoMapper.insert(record);
    }

    public int insertSelective(SysUserInfo record) {
        return this.sysUserInfoMapper.insertSelective(record);
    }
}