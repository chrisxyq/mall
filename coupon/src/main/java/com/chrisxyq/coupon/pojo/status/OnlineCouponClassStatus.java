package com.chrisxyq.coupon.pojo.status;

import org.springframework.stereotype.Component;

@Component
public class OnlineCouponClassStatus  implements ICouponClassStatus{
    @Override
    public void offlineCouponClass(long couponClassId) {

    }

    @Override
    public void invalidCouponClass(long couponClassId) {

    }
}
