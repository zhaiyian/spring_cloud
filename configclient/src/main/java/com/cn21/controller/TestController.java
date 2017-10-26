package com.cn21.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: ZHAIYA
 * @Date: 2017-10-23 16:31
 **/
@RestController
@RefreshScope
public class TestController {
    @Value("${info}")
    String info;

    @RequestMapping(value = "/hi")
    public String hi() {
        return info;
    }
}
