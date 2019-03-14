package com.pattern.strategy.promotion;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 9:51
 * @Version 1.0
 */
public class CashBackStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("返现");
    }

}
