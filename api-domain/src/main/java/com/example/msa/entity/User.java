package com.example.msa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;


@Getter
@Setter
@NoArgsConstructor
@Alias("user")
public class User {

    private String userId;

    private String userName;

    private String userPassword;

    private String userEmail;


}
