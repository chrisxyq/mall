package com.chrisxyq.coupon.pojo.status;


public interface ICouponClassStatus {
    /**
     * 下架券类
     * @param couponClassId
     */
    void offlineCouponClass(long couponClassId);
    /**
     * 作废券类
     * @param couponClassId
     */
    void invalidCouponClass(long couponClassId);
}
