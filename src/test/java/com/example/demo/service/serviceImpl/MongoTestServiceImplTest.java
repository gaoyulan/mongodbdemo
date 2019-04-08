package com.example.demo.service.serviceImpl;

import com.example.demo.domian.Staff;
import com.example.demo.repository.MongoTestDao;
import net.minidev.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by GaoYuLan on 2019/4/2 10:58.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoTestServiceImplTest {
    @Autowired
    private MongoTestDao mongoTestDao;

    @Test
    public void saveOne() throws Exception {

        int []tel={1,2};
        Staff staff = new Staff();
        staff.setId("123");
        staff.setNumber(1);
        staff.setName("王贵");
        staff.setDept("龙慧公司副经理");
        staff.setRoom("901");
        staff.setTel(tel);
        Staff test = mongoTestDao.save(staff);
        System.out.println(test);
    }

    @Test
    public void insertOne() throws Exception {

        int []tel={1,2};
        Staff staff = new Staff();
        staff.setId("123");
        staff.setNumber(1);
        staff.setName("王贵");
        staff.setDept("龙慧公司副经理");
        staff.setRoom("901");
        staff.setTel(tel);
        Staff test = mongoTestDao.insertOne(staff);
        System.out.println(test);
    }

    @Test
    public void batchInsert() throws Exception {

        List<Staff> list = new ArrayList<>();
        int []tel={1,2};
        Staff staff = new Staff();
        staff.setNumber(1);
        staff.setName("王贵");
        staff.setDept("龙慧公司副经理");
        staff.setRoom("901");
        staff.setTel(tel);
        list.add(staff);

        Staff staff1 = new Staff();
        staff1.setNumber(1);
        staff1.setName("王贵1");
        staff1.setDept("龙慧公司副经理");
        staff1.setRoom("901");
        staff1.setTel(tel);
        list.add(staff1);

        System.out.println(mongoTestDao.batchInsert(list));
    }

    @Test
    public void findById() throws Exception {

        String id = "5ca2d1da57d3572cf4737592";
        Staff staff = mongoTestDao.findById(id);
        System.out.println(staff);
    }

    @Test
    public void delete() throws Exception {
        String id = "5ca2d1da57d3572cf4737592";
        mongoTestDao.delete(id);
    }

    @Test
    public void findList() throws Exception {
        List<Staff> staffList = mongoTestDao.findList();
        System.out.println(staffList);
    }
}
