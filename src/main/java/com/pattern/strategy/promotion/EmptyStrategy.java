package com.pattern.strategy.promotion;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 9:49
 * @Version 1.0
 */
public class EmptyStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("没有活动");
    }

}
