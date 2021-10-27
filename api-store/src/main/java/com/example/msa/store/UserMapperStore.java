package com.example.msa.store;

import com.example.msa.entity.User;
import com.example.msa.store.jpo.UserJpo;
import com.example.msa.store.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapperStore implements UserStore {

    private final UserMapper userMapper;

    public UserMapperStore(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findById(String id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> findByCondition(User user) {
        return userMapper.findByCondition(new UserJpo(user));
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

}
