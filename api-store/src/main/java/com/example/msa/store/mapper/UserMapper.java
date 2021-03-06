package com.example.msa.store.mapper;

import com.example.msa.entity.User;
import com.example.msa.entity.UserRdo;
import com.example.msa.store.jpo.UserJpo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int count(UserJpo jpo);
    UserJpo findById(String id);
    List<UserJpo> findByCondition(UserJpo jpo);
    int totalCount();
    int update(UserJpo jpo);
    int insert(UserJpo jpo);
    int delete(UserJpo jpo);
}
