package com.test.po;

import javafx.scene.DepthTest;

import java.io.Serializable;
import java.util.Date;

public class emp implements Serializable {
    private int id;
    private String name;
    private String sex;
    private Date hiredate;
    private int deptno;
    private dept deptname;

    public emp() {
    }

    public emp(int id, String name, String sex, Date hiredate, int deptno) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.hiredate = hiredate;
        this.deptno = deptno;
    }

    public emp(int id, String name, String sex, Date hiredate, dept deptname) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.hiredate = hiredate;
        this.deptname = deptname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public dept getDeptname() {
        return deptname;
    }

    public void setDeptname(dept deptname) {
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", hiredate=" + hiredate +
                ", deptno=" + deptno +
                ", deptname=" + deptname +
                '}';
    }
}
