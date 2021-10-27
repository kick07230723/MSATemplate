package com.example.msa.entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User {

    private String id;
    private String name;
    private String password;
    private String email;
    private String reg_dt;

    private Integer offset;
    private Integer limit;
    private String sort;
    private String direction;

    public User(){
        if(offset == null)
            offset = 10;
        if(limit == null)
            limit = 0;
    }
}
