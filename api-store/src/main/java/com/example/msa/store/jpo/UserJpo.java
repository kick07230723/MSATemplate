package com.example.msa.store.jpo;

import com.example.msa.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@NoArgsConstructor
@Alias("userJpo")
public class UserJpo extends User {

    private String userId;

    private String userName;

    private String userPassword;

    private String userEmail;

}
