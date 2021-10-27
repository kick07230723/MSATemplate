package com.example.msa.spec;

import com.example.msa.entity.User;

import java.util.List;

public interface UserService {

    List<User> findByCondition(User user);
    List<User> findByName(String name);
    User findById(String id);
    List<User> getPasswordById(String id);
    int count(User user);
    int totalCount();
    int update(User user);

}
