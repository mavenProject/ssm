package cn.springmvc.service.impl;

import cn.springmvc.dao.SysPersonMapper;
import cn.springmvc.model.SysPerson;
import cn.springmvc.objModel.Criteria;
import cn.springmvc.service.SysPersonService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysPersonServiceImpl implements SysPersonService {
    @Autowired
    private SysPersonMapper sysPersonMapper;

    private static final Logger logger = LoggerFactory.getLogger(SysPersonServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.sysPersonMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public SysPerson selectByPrimaryKey(String fdObjectid) {
        return this.sysPersonMapper.selectByPrimaryKey(fdObjectid);
    }

    public List<SysPerson> selectByExample(Criteria example) {
        return this.sysPersonMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String fdObjectid) {
        return this.sysPersonMapper.deleteByPrimaryKey(fdObjectid);
    }

    public int updateByPrimaryKeySelective(SysPerson record) {
        return this.sysPersonMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysPerson record) {
        return this.sysPersonMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.sysPersonMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SysPerson record, Criteria example) {
        return this.sysPersonMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(SysPerson record, Criteria example) {
        return this.sysPersonMapper.updateByExample(record, example.getCondition());
    }

    public int insert(SysPerson record) {
        return this.sysPersonMapper.insert(record);
    }

    public int insertSelective(SysPerson record) {
        return this.sysPersonMapper.insertSelective(record);
    }
}