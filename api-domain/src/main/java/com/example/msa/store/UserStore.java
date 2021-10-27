package com.example.msa.store;

import com.example.msa.entity.User;
import com.example.msa.entity.UserRdo;

import java.util.List;

public interface UserStore {

    UserRdo findById(String id);
    List<UserRdo> findByCondition(User user);
    int totalCount();
    int count(User user);
    int update(User user);
    int insert(User user);
    int delete(User user);
}
