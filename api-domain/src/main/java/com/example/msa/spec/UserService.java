package com.example.msa.spec;

import com.example.msa.entity.User;

import java.util.List;

public interface UserService {

    User findById(String id);
    List<User> findByCondition(User user);
    int totalCount();
    int count(User user);
    int update(User user);

}
