package com.chrisxyq.malloffline;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MallOfflineApplication.class)
public class RocketMQTemplateTest {
    @Autowired
    RocketMQTemplate rocketMQTemplate;

    @Test
    public void offlineCouponClassTest() {
        rocketMQTemplate.convertAndSend("couponclass.change", "Hello springboot-rocketmq");
    }
}