package com.cn21.account.feign.controller;

import com.cn21.account.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: ZHAIYA
 * @Date: 2017-10-19 14:31
 **/
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @RequestMapping("get")
    public String get(@RequestParam int id) {
        return schedualServiceHi.get(id);
    }

    @RequestMapping("insert")
    public String insert(@RequestParam int account, @RequestParam String userName, @RequestParam String mobile) {
        return schedualServiceHi.insert(account, userName, mobile);
    }
}
