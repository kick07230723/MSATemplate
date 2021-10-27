package com.example.msa.logic;

import com.example.msa.entity.User;
import com.example.msa.spec.UserService;
import com.example.msa.store.UserStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class UserLogic implements UserService {

    private final UserStore userStore;

    public UserLogic(@Lazy UserStore userStore) {
        this.userStore = userStore;
    }


    @Override
    public User findById(String id) {
        return userStore.findById(id);
    }

    @Override
    public int totalCount() {
        return userStore.totalCount();
    }

    @Override
    public List<User> findByCondition(User user) {
        return userStore.findByCondition(user);
    }

    @Override
    public int count(User user) {
        return userStore.count(user);
    }

    @Override
    public int update(User user) {
        return userStore.update(user);
    }

    @Override
    public int insert(User user) {
        return userStore.insert(user);
    }

    @Override
    public int delete(User user) {
        return userStore.delete(user);
    }
}
