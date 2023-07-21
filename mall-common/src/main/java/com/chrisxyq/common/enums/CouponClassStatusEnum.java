package com.chrisxyq.common.enums;

public enum CouponClassStatusEnum {
    WAIT_ONLINE(1),
    ONLINE(2),
    OFFLINE(3),
    INVALID(4);

    private int value;

    CouponClassStatusEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static CouponClassStatusEnum getEnum(int value) {
        CouponClassStatusEnum anEnum = null;
        CouponClassStatusEnum[] couponStatusEnums = CouponClassStatusEnum.values();
        for (CouponClassStatusEnum itemEnum : couponStatusEnums) {
            if (itemEnum.getValue() == value) {
                anEnum = itemEnum;
                break;
            }
        }
        return anEnum;
    }
}
