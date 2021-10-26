package com.example.msa.rest;

import com.example.msa.entity.ResultMessage;
import com.example.msa.entity.User;
import com.example.msa.spec.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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

    @GetMapping("/{userId}")
    public ResponseEntity<ResultMessage> findById(@PathVariable String userId) throws Exception{

        log.debug("### FindById : {}",userId);
        User user = userService.findById(userId);
        log.debug(user.toString());

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result", user);

        ResultMessage message = new ResultMessage();
        message.setPayload(resultMap);

        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
}
