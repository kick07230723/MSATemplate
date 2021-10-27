package com.example.msa.store.jpo;

import com.example.msa.entity.User;
import com.example.msa.entity.UserRdo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@Alias("userJpo")
public class UserJpo extends User{
    private String id;
    private String name;
    private String password;
    private String email;
    private String reg_dt;

    public UserJpo(User user) {
        if (user != null) {
            BeanUtils.copyProperties(user, this);
        }
    }

    public UserRdo toDomain() {
        UserRdo user = new UserRdo();
        BeanUtils.copyProperties(this, user);
        return user;
    }


}
