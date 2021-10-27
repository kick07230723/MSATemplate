package com.example.msa.rest;

import com.example.msa.entity.ResultMessage;
import com.example.msa.entity.User;
import com.example.msa.entity.UserRdo;
import com.example.msa.spec.UserService;
import com.example.msa.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RequestMapping("/demo/v0.1/users")
@CrossOrigin("*")
@RestController
public class UserResource {

//    @Autowired
    private final UserService userService;
    public UserResource(UserService userService){
        this.userService = userService;
    }

//    http://localhost:8085/demo/v0.1/users/kick23
    @GetMapping("/{id}")
    public ResponseEntity<ResultMessage> findById(@PathVariable String id) throws Exception{
        log.debug("### findById : {}", id);
        UserRdo user = userService.findById(id);
        ResultMessage message = ResultUtil.getResultMessage(user);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

//    http://localhost:8085/demo/v0.1/users?id=kick23
    @GetMapping
    public ResponseEntity<ResultMessage> findByCondition(User user) throws Exception{
        log.debug("### findByCondition : {}", user);
        List<UserRdo> userList = userService.findByCondition(user);
        ResultMessage message = ResultUtil.getResultMessage(userList);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

//    http://localhost:8085/demo/v0.1/users/totalCount
    @GetMapping("/totalCount")
    public ResponseEntity<ResultMessage> totalCount() throws Exception{
        log.debug("### totalCount");
        Integer count = userService.totalCount();
        ResultMessage message = ResultUtil.getResultMessage(count);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

//    http://localhost:8085/demo/v0.1/users/count/?id=kick23
    @GetMapping("/count")
    public ResponseEntity<ResultMessage> count(User user) throws Exception{
        log.debug("### count");
        Integer count = userService.count(user);
        ResultMessage message = ResultUtil.getResultMessage(count);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

//    http://localhost:8085/demo/v0.1/users?id=test1&password=1234&name=tester&email=tester@mail
    @PostMapping
    public ResponseEntity<ResultMessage> insert(User user, HttpServletRequest request) throws Exception{
        log.debug("### insert {}", user.toString());
        Integer count = userService.insert(user);
        ResultMessage message = ResultUtil.getResultMessage(count);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

//    http://localhost:8085/demo/v0.1/users?id=test1&password=1111&name=tester&email=tester@mail
    @PutMapping
    public ResponseEntity<ResultMessage> update(User user, HttpServletRequest request) throws Exception{
        log.debug("### update {}", user.toString());
        Integer count = userService.update(user);
        ResultMessage message = ResultUtil.getResultMessage(count);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

//    http://localhost:8085/demo/v0.1/users?id=user1
    @DeleteMapping
    public ResponseEntity<ResultMessage> delete(User user, HttpServletRequest request) throws Exception{
        log.debug("### delete {}", user.toString());
        Integer count = userService.delete(user);
        ResultMessage message = ResultUtil.getResultMessage(count);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

}
