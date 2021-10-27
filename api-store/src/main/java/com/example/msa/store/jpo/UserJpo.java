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
    private String id;

    private String name;

    private String password;

    private String email;

}
