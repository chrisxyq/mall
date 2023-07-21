package com.chrisxyq.coupon.pojo.statemachine;

import com.chrisxyq.common.enums.CouponClassStatusEnum;
import com.chrisxyq.coupon.pojo.status.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class CouponClassStateMachine {
    @Autowired
    OfflineCouponClassStatus    offlineCouponClass;
    @Autowired
    WaitOnlineCouponClassStatus waitOnlineCouponClassStatus;
    @Autowired
    OnlineCouponClassStatus     onlineCouponClassStatus;
    @Autowired
    InvalidCouponClassStatus    invalidCouponClassStatus;

    private Map<Enum<CouponClassStatusEnum>, ICouponClassStatus> stateMap = new ConcurrentHashMap<Enum<CouponClassStatusEnum>, ICouponClassStatus>();

    @PostConstruct
    public void init() {
        stateMap.put(CouponClassStatusEnum.WAIT_ONLINE, waitOnlineCouponClassStatus);
        stateMap.put(CouponClassStatusEnum.ONLINE, onlineCouponClassStatus);
        stateMap.put(CouponClassStatusEnum.OFFLINE, offlineCouponClass);
        stateMap.put(CouponClassStatusEnum.INVALID, invalidCouponClassStatus);
    }

    public void offlineCouponClass(long couponClassId, Enum<CouponClassStatusEnum> currentStatusEnum) {
        stateMap.get(currentStatusEnum).offlineCouponClass(couponClassId);
    }
}
