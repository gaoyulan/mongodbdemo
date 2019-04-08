package com.example.demo.domian;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by GaoYuLan on 2019/4/1 17:22.
 */
@Document(collection = "mongoTestStaff")
@Data
public class Staff {

    @Id
    private String id;

    private int number;

    private String name;

    private String dept;

    private String room;

    private int []tel;

    private int phone;

    @Field("direct_dial")
    private int directDial;

    private String email;

    private String cnpc;

}
