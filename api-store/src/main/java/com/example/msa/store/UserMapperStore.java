package com.example.msa.store;

import com.example.msa.entity.User;
import com.example.msa.entity.UserRdo;
import com.example.msa.store.jpo.UserJpo;
import com.example.msa.store.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapperStore implements UserStore {

    private final UserMapper userMapper;

    public UserMapperStore(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserRdo findById(String id) {
        UserJpo userJpo =  userMapper.findById(id);
        if(userJpo != null) {
            return userJpo.toDomain();
        } else {
            return null;
        }
    }

    @Override
    public List<UserRdo> findByCondition(User user) {
        //return userMapper.findByCondition(new UserJpo(user));
        List<UserJpo> userList = userMapper.findByCondition(new UserJpo(user));
        return userList.stream().map(UserJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public int count(User user) {
        return userMapper.count(new UserJpo(user));
    }

    @Override
    public int totalCount() {
        return userMapper.totalCount();
    }

    @Override
    public int update(User user) {
        return userMapper.update(new UserJpo(user));
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(new UserJpo(user));
    }

    @Override
    public int delete(User user) {
        return userMapper.delete(new UserJpo(user));
    }

}
