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


    @Override
    public void insert(Staff staff) {
        mongoTemplate.save(staff);
    }

    @Override
    public void batchInsert(List<Staff> staffList) {
        mongoTemplate.insertAll(staffList);
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
