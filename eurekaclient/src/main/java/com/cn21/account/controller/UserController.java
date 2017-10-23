package com.cn21.account.controller;

import com.alibaba.fastjson.JSONObject;
import com.cn21.account.dao.UserMapper;
import com.cn21.account.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: ZHAIYA
 * @Date: 2017-10-19 12:04
 **/
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("get")
    public String get(@RequestParam int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return JSONObject.toJSONString(user);
    }

    @RequestMapping("insert")
    public String insert(@RequestParam int account, @RequestParam String userName, @RequestParam String mobile) {
        User user = new User();
        user.setAccount(account);
        user.setUserName(userName);
        user.setMobile(mobile);
        userMapper.insert(user);
        return "success";
    }
}
