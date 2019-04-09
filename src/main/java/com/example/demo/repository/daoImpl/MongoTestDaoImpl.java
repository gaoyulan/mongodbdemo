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

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:15
     * @description 插入一条数据
     * @params [staff]
     * @return void
     */
    @Override
    public Staff insertOne(Staff staff) {
        Staff test = mongoTemplate.insert(staff);
        return test;
    }

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:16
     * @description 批量插入
     * @params [staffList]
     * @return void
     */
    @Override
    public List<Staff> batchInsert(List<Staff> staffList) {
        List<Staff> list = ( List<Staff>)mongoTemplate.insertAll(staffList);
        return list;
    }

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:18
     * @description 根据id查询数据
     * @params [id]
     * @return com.example.demo.domian.Staff
     */
    @Override
    public Staff findById(String id) {
//        Query query = new Query(Criteria.where("_id").is(id));
//        Staff staff = mongoTemplate.findOne(query, Staff.class);
        Staff staff = mongoTemplate.findById(id,Staff.class);
        return staff;
    }

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:19
     * @description 查询多条数据
     * @params [staff]
     * @return java.util.List<com.example.demo.domian.Staff>
     */
    @Override
    public List<Staff> findList() {
        List<Staff> staffList = mongoTemplate.findAll(Staff.class);
        return staffList;
    }

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:20
     * @description 更新数据
     * @params [staff]
     * @return void
     */
    @Override
    public void update(Staff staff) {
    }

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:20
     * @description 删除数据
     * @params [id]
     * @return void
     */
    @Override
    public void delete(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Staff.class);
    }
}
