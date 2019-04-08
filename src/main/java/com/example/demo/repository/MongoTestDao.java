package com.example.demo.repository;


import com.example.demo.domian.Staff;

import java.util.List;

/**
 * Created by GaoYuLan on 2019/4/1 17:23.
 */
public interface MongoTestDao {

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:15
     * @description 保存一条数据
     * @params [staff]
     * @return void
    */
    Staff save(Staff staff);

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:15
     * @description 插入一条数据
     * @params [staff]
     * @return void
     */
    Staff insertOne(Staff staff);

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:16
     * @description 批量插入
     * @params [staffList]
     * @return void
    */
    List<Staff> batchInsert(List<Staff> staffList);

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:18
     * @description 根据id查询数据
     * @params [id]
     * @return com.example.demo.domian.Staff
    */
    Staff findById(String id);

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:19
     * @description 查询多条数据
     * @params [staff]
     * @return java.util.List<com.example.demo.domian.Staff>
    */
    List<Staff> findList();

    //分页查询

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:20
     * @description 更新数据
     * @params [staff]
     * @return void
    */
    void update(Staff staff);

    /**
     * @author GaoYuLan
     * @date 2019/4/2 10:20
     * @description 删除数据
     * @params [id]
     * @return void
    */
    void delete(String id);
}
