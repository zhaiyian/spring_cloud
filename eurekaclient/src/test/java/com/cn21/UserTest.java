package com.cn21;

import com.cn21.account.dao.UserMapper;
import com.cn21.account.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author: ZHAIYA
 * @Date: 2017-10-19 12:20
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public  void test(){
        System.out.println("2222222222222222");
    }

    @Test
    public void insert() {
        User user = new User();
        user.setAccount(123456);
        user.setUserName("zya");
        user.setMobile("18888888888");
        userMapper.insertSelective(user);
    }

    @Test
    public  void  get(){
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.toString());
    }

}
