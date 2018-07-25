package cn.itcast.mybatis.junit;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.itcast.mybatis.dao.UserDao;
import cn.itcast.mybatis.dao.UserDaoImpl;
import cn.itcast.mybatis.pojo.User;

public class MybatisDaoTest {

	public SqlSessionFactory sqlSessionFactory;
	@Before
	public void before() throws Exception {
		//���غ��������ļ�
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		//����SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
	}
	@Test
	public void testDao() throws Exception {
		
		UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
		
		User user = userDao.selectUserById(10);
		System.out.println(user);
	}
}
