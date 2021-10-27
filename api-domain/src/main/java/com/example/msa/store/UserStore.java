package com.example.msa.store;

import com.example.msa.entity.User;

import java.util.List;

public interface UserStore {

    User findById(String id);
    int count(User user);
    int totalCount();
    List<User> findByCondition(User user);
    String getPasswdById(String id);
    int update(User user);

}
