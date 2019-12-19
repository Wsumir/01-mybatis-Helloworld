package com.icss.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.icss.mybatis.pojo.Dept;

public interface DeptMapper {
   void insert(Dept dept);
   void update(Dept dept);
   void delete(Integer deptId);
   Dept queryById(Integer deptId);
   Dept queryById2(Integer deptId);
   List<Dept> query();
   int count();
   int avgId();
   List<Map<String, Object>> queryAvgSal();
}	