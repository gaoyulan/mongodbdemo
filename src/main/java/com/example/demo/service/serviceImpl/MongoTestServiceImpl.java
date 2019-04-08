package com.example.demo.service.serviceImpl;

import com.example.demo.domian.Staff;
import com.example.demo.repository.MongoTestDao;
import com.example.demo.service.MongoTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by GaoYuLan on 2019/4/1 17:26.
 */
@Service
public class MongoTestServiceImpl implements MongoTestService{

    @Autowired
    private MongoTestService mongoTestService;

    @Autowired
    private MongoTestDao mongoTestDao;

    @Override
    public void saveOne(Staff staff) {
        mongoTestDao.insert(staff);
    }
}
