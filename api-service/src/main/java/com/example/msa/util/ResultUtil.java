package com.example.msa.util;

import com.example.msa.entity.ResultMessage;
import com.example.msa.entity.User;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class ResultUtil {

    public static ResultMessage getResultMessage(User user) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result", user);

        if (user != null)
            log.debug("### Result(User) : {}", user.toString());

        ResultMessage message = new ResultMessage();
        message.setPayload(resultMap);
        return message;
    }

    public static ResultMessage getResultMessage(Integer count) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result", count);

        if (count != null)
            log.debug("### Result(Count) : {}", count);

        ResultMessage message = new ResultMessage();
        message.setPayload(resultMap);
        return message;
    }


    public static ResultMessage getResultMessage(List<User> userList) {
        Map<String, Object> resultMap = new HashMap<>();

        for (User user: userList) {
            resultMap.put("result", user);
            if (user != null)
                log.debug("### Result(List) : {}", user.toString());
        }

        ResultMessage message = new ResultMessage();
        message.setPayload(resultMap);
        return message;
    }
}
