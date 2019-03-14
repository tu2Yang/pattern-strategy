package com.pattern.strategy.promotion;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 9:50
 * @Version 1.0
 */
public class CouponStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("优惠券");
    }

}
