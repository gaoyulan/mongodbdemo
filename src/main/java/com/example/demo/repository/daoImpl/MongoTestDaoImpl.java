package com.example.demo.repository.daoImpl;

import com.example.demo.domian.Staff;
import com.example.demo.repository.MongoTestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by GaoYuLan on 2019/4/2 10:21.
 */
@Repository
public class MongoTestDaoImpl implements MongoTestDao{

    @Autowired
    private MongoTemplate mongoTemplate;


    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:15
     * @description 保存一条数据
     * @params [staff]
     * @return void
     */
    @Override
    public Staff save(Staff staff) {
        Staff test = mongoTemplate.save(staff);
        return test;
    }

    @Override
    public Staff insertOne(Staff staff) {
        Staff test = mongoTemplate.insert(staff);
        return test;
    }

    @Override
    public List<Staff> batchInsert(List<Staff> staffList) {
        List<Staff> list = ( List<Staff>)mongoTemplate.insertAll(staffList);
        return list;
    }

    @Override
    public Staff findById(String id) {
//        Query query = new Query(Criteria.where("_id").is(id));
//        Staff staff = mongoTemplate.findOne(query, Staff.class);
        Staff staff = mongoTemplate.findById(id,Staff.class);
        return staff;
    }

    @Override
    public List<Staff> findList() {
        List<Staff> staffList = mongoTemplate.findAll(Staff.class);
        return staffList;
    }

    @Override
    public void update(Staff staff) {
    }

    @Override
    public void delete(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Staff.class);
    }
}
