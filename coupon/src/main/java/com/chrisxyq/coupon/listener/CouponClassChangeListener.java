package com.chrisxyq.coupon.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(topic = "couponclass.change", consumerGroup = "${rocketmq.consumer.group}")
public class CouponClassChangeListener implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("接收到消息" + s);
    }
}
