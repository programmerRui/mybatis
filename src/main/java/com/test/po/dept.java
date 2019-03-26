package com.test.po;

import java.io.Serializable;
import java.util.List;

public class dept implements Serializable {
    private int deptid;
    private String deptname;
    private List<emp> empList;

    public dept() {
    }

    public dept(int deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    public dept(int deptid, String deptname, List<emp> empList) {
        this.deptid = deptid;
        this.deptname = deptname;
        this.empList = empList;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public List<emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<emp> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "dept{" +
                "deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                ", empList=" + empList +
                '}';
    }
}
