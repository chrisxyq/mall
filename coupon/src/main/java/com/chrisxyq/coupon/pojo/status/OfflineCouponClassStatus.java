package com.chrisxyq.coupon.pojo.status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class OfflineCouponClassStatus implements ICouponClassStatus {
    private static final Logger logger = LoggerFactory.getLogger(OfflineCouponClassStatus.class);

    @Override
    public void offlineCouponClass(long couponClassId) {
        logger.info("offlineCouponClass {} success by {}.", couponClassId, this.getClass().getSimpleName());
    }

    @Override
    public void invalidCouponClass(long couponClassId) {
        logger.info("invalidCouponClass {} success by {}.", couponClassId, this.getClass().getSimpleName());
    }
}
