package com.chrisxyq.coupon;

import com.chrisxyq.common.enums.CouponClassStatusEnum;
import com.chrisxyq.coupon.pojo.statemachine.CouponClassStateMachine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CouponApplication.class)
public class CouponClassStateMachineTest {
    @Autowired
    CouponClassStateMachine couponClassStateMachine;

    @Test
    public void offlineCouponClassTest() {
        couponClassStateMachine.offlineCouponClass(1001, CouponClassStatusEnum.OFFLINE);
    }
}
