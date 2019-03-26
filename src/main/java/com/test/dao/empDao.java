package com.test.dao;

import com.test.po.emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface empDao {
    int  insert_employee(emp employee);
    int  delete_employeeID(int id);
    int  update_employee(emp employee);
    int  update_emp(emp employee);
    List<emp> queryAll();
    emp queryById(int id);
    List<emp>  queryBy(@Param("name") String name, @Param("sex") String sex, @Param("id") int id);
    int deleteList(List list);
    int deleteMap(Map map);
}
