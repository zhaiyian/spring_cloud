package com.cn21.account.feign.service.impl;

import com.cn21.account.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author: ZHAIYA
 * @Date: 2017-10-19 14:48
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry " + name;
    }

    @Override
    public String get(@RequestParam(value = "id") int id) {
        return "get error!";
    }

    @Override
    public String insert(@RequestParam(value = "account") int account, @RequestParam(value = "userName") String userName, @RequestParam(value = "mobile") String mobile) {
        return "insert error!";
    }
}
