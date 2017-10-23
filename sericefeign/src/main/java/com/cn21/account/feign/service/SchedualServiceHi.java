package com.cn21.account.feign.service;

import com.cn21.account.feign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author: ZHAIYA
 * @Date: 2017-10-19 14:29
 **/
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/user/get", method = RequestMethod.GET)
    String get(@RequestParam(value = "id") int id);

    @RequestMapping(value = "/user/insert", method = RequestMethod.GET)
    String insert(@RequestParam(value = "account") int account, @RequestParam(value = "userName") String userName, @RequestParam(value = "mobile") String mobile);
}
