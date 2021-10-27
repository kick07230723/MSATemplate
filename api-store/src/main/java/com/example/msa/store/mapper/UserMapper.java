package com.example.msa.store.mapper;

import com.example.msa.entity.User;
import com.example.msa.store.jpo.UserJpo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int count(UserJpo jpo);
    User findById(String id);
    String getPasswordById(String id);
    List<UserJpo> findByCondition(UserJpo jpo);
    int totalCount();
}
