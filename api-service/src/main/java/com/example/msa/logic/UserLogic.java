package com.example.msa.logic;

import com.example.msa.entity.User;
import com.example.msa.spec.UserService;
import com.example.msa.store.UserStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class UserLogic implements UserService {

    private final UserStore userStore;
    public UserLogic(UserStore userStore){ this.userStore = userStore; }


    @Override
    public List<User> findByCondition(User user) {
        return null;
    }

    @Override
    public List<User> findByName(String name) {
        return null;
    }

    @Override
    public User findById(String id) {
        return userStore.findById(id);
    }

    @Override
    public List<User> getPasswordById(String id) {
        return null;
    }

    @Override
    public int count(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }
}
