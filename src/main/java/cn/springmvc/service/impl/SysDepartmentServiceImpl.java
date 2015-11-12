package cn.springmvc.service.impl;

import cn.springmvc.dao.SysDepartmentMapper;
import cn.springmvc.model.SysDepartment;
import cn.springmvc.objModel.Criteria;
import cn.springmvc.service.SysDepartmentService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysDepartmentServiceImpl implements SysDepartmentService {
    @Autowired
    private SysDepartmentMapper sysDepartmentMapper;

    private static final Logger logger = LoggerFactory.getLogger(SysDepartmentServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.sysDepartmentMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public SysDepartment selectByPrimaryKey(String fdObjectid) {
        return this.sysDepartmentMapper.selectByPrimaryKey(fdObjectid);
    }

    public List<SysDepartment> selectByExample(Criteria example) {
        return this.sysDepartmentMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String fdObjectid) {
        return this.sysDepartmentMapper.deleteByPrimaryKey(fdObjectid);
    }

    public int updateByPrimaryKeySelective(SysDepartment record) {
        return this.sysDepartmentMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysDepartment record) {
        return this.sysDepartmentMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.sysDepartmentMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SysDepartment record, Criteria example) {
        return this.sysDepartmentMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(SysDepartment record, Criteria example) {
        return this.sysDepartmentMapper.updateByExample(record, example.getCondition());
    }

    public int insert(SysDepartment record) {
        return this.sysDepartmentMapper.insert(record);
    }

    public int insertSelective(SysDepartment record) {
        return this.sysDepartmentMapper.insertSelective(record);
    }
}