package com.pattern.strategy.promotion;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 9:57
 * @Version 1.0
 */
public class PromotionTest {

//    public static void main(String[] args) {
//        PromotionActivity pa = new PromotionActivity(new CashBackStrategy());
//        pa.execute();
//    }

    public static void main(String[] args) {
        PromotionActivity pa = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("GROUPBUY"));
        pa.execute();
    }

}
