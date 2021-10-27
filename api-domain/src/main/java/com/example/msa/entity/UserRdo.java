package com.example.msa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;


@Getter
@Setter
public class UserRdo {

    private String id;
    private String name;
    private String password;
    private String email;
    private String reg_dt;

}
