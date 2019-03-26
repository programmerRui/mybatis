package com.test.dao;

import com.test.po.dept;

import java.util.List;

public interface deptDao {
    dept deptselect(String deptname);
    List<dept> deptAll();
}
