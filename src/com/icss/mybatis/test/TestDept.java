package com.icss.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.icss.mybatis.dao.DeptMapper;
import com.icss.mybatis.pojo.Dept;

public class TestDept {
	
	private String filename="mybatis-config.xml";
	
	@Test
	public void testInsert() throws IOException{
		
	InputStream is = Resources.getResourceAsStream(filename);
	SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
	SqlSession session =factory.openSession();
	
	DeptMapper mapper = session.getMapper(DeptMapper.class);
	Dept dept = new Dept("技术部","北");
	mapper.insert(dept);
	session.commit();
	session.close();
	}
	
	@Test
	public void testUpdate() throws IOException{
		
	InputStream is = Resources.getResourceAsStream(filename);
	SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
	SqlSession session =factory.openSession();
	
	DeptMapper mapper = session.getMapper(DeptMapper.class);
	Dept dept = new Dept(1,"教务部","沈阳");
	mapper.update(dept);
	session.commit();
	session.close();
	}

	@Test
	public void testDelete() throws IOException{
		
	InputStream is = Resources.getResourceAsStream(filename);
	SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
	SqlSession session =factory.openSession();
	
	DeptMapper mapper = session.getMapper(DeptMapper.class);
	mapper.delete(4);
	session.commit();
	session.close();
	}
	
	@Test
	public void testQueryById() throws IOException{
		
	InputStream is = Resources.getResourceAsStream(filename);
	SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
	SqlSession session =factory.openSession();
	
	DeptMapper mapper = session.getMapper(DeptMapper.class);
	Dept dept=mapper.queryById(8);
	System.out.println(dept);
	session.close();
	}
	
	@Test
	public void testQueryById2() throws IOException{
		
	InputStream is = Resources.getResourceAsStream(filename);
	SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
	SqlSession session =factory.openSession();
	
	DeptMapper mapper = session.getMapper(DeptMapper.class);
	Dept dept=mapper.queryById2(8);
	System.out.println(dept);
	session.close();
	}
	
	@Test
	public void testQuery() throws IOException{
		
	InputStream is = Resources.getResourceAsStream(filename);
	SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
	SqlSession session =factory.openSession();
	
	DeptMapper mapper = session.getMapper(DeptMapper.class);
	List<Dept> list=mapper.query();
	for(Dept dept:list)
	{
		System.out.println(dept);
	}
	session.close();
	}
	
	@Test
	public void testcount() throws IOException{
		
	InputStream is = Resources.getResourceAsStream(filename);
	SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
	SqlSession session =factory.openSession();
	
	DeptMapper mapper = session.getMapper(DeptMapper.class);
	
	int count =mapper.count();
	System.out.println(count);
	session.close();
	}
	
	@Test
	public void testavgSal() throws IOException{
		
	InputStream is = Resources.getResourceAsStream(filename);
	SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
	SqlSession session =factory.openSession();
	
	DeptMapper mapper = session.getMapper(DeptMapper.class);
	
	List<Map<String, Object>> avgSal=mapper.queryAvgSal();
	for(Map map:avgSal)
	{
		System.out.println(map);
	}
	session.close();
	}
	
	
	
	
}
