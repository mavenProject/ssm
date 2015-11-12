package test;


import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.springmvc.dao.SysPersonMapper;
import cn.springmvc.objModel.Criteria;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/config/spring-mybatis.xml" })
@TransactionConfiguration(defaultRollback = true)
public class Test extends AbstractTransactionalJUnit4SpringContextTests{
	
    protected final Logger logger = LoggerFactory.getLogger(this.getClass()); 
    
	@Override
	@Resource(name = "dataSource")
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
	
	@Autowired
	SysPersonMapper sysPersonDao;
	
	@org.junit.Test
	public void countByExample() {
		int a = sysPersonDao.countByExample(new Criteria());
		logger.info("TestcountByExample() - int a=" + a);
		//assertEquals(2, a);
	}
	
	
	
	
	
	
	
	
	
}
