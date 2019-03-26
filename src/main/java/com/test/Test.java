package com.test;

import com.test.dao.deptDao;
import com.test.dao.empDao;
import com.test.po.dept;
import com.test.po.emp;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 1.读取配置文件
        InputStream iStream = Test.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        // 2.获取sqlsessionfactory 工厂
        SqlSessionFactory sFactory = new SqlSessionFactoryBuilder().build(iStream);
        // 3.工厂产生sqlsession
        SqlSession session = sFactory.openSession();
        empDao eDao = session.getMapper(empDao.class);
        deptDao dDao=session.getMapper(deptDao.class);
        // delete(session, eDao);
        //deleteList(session,eDao);
        //deletemap(session,eDao);
        //update(session, eDao);
        //update1(session,eDao);
        //queryall(session, eDao);
        //querybyid(session, eDao);
        //insert(session, eDao);
        //queryBy(session,eDao);
        //selectdept(session,dDao);
        select(session,dDao);
    }

    private static void deletemap(SqlSession session, empDao eDao) {
         List<Integer> ids=new ArrayList<>();
         ids.add(19);
         ids.add(17);
         ids.add(18);
        Map<String,Object> map=new HashMap();
        map.put("ids",ids);
        map.put("deptno",2);
        eDao.deleteMap(map);
        session.commit();
    }

    private static void deleteList(SqlSession session, empDao eDao) {
        List<Integer> id=new ArrayList<>();
        id.add(13);
        id.add(14);
        id.add(15);
        eDao.deleteList(id);
        session.commit();
    }

    private static void update1(SqlSession session, empDao eDao) {
        emp employee = new emp(12,"杨幂","女", new Date(),1);
        int i = eDao.update_emp(employee);
        session.commit();
    }


    private static void queryBy(SqlSession session, empDao eDao) {
        List<emp> list=eDao.queryBy("柳","男",0);
        for(emp emp :list){
            System.out.println(emp);
        }
    }

    private static void select(SqlSession session, deptDao dDao) {
        List<dept> deptList=dDao.deptAll();
        for (dept list:deptList){
            System.out.println(list);
        }
        session.commit();
        System.out.println(deptList);
        System.out.println("第二次输入");
        List<dept> deptList1=dDao.deptAll();
        for (dept list:deptList1){
            System.out.println(list);
        }
        session.commit();
        System.out.println(deptList1);
    }

    private static void selectdept(SqlSession session, deptDao dDao) {
        dept deptList=dDao.deptselect("开发部");
        System.out.println(deptList);
    }

    private static void insert(SqlSession session, empDao eDao) {
        emp employee = new emp(0,"丁鹏","男", new Date(),3);
        int num = eDao.insert_employee(employee);
        System.out.println(num);
        session.commit();

    }

    static void querybyid(SqlSession session, empDao eDao) {
        emp employee = eDao.queryById(4);
        System.out.println(employee);
    }

    static void queryall(SqlSession session, empDao eDao) {
        List<emp> employees = eDao.queryAll();
        for (emp employee : employees) {
            System.out.println(employee);
        }
    }

    static void update(SqlSession session, empDao eDao) {
        emp employee = new emp(9,"叶开","男", new Date(),1);
        int num = eDao.update_employee(employee);
        System.out.println(num);
        session.commit();
    }

    static void delete(SqlSession session, empDao eDao) {
        int num = eDao.delete_employeeID(48);
        session.commit();
        System.out.println(num);
    }
}
