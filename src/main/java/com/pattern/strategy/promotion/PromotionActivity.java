package com.pattern.strategy.promotion;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 9:56
 * @Version 1.0
 */
public class PromotionActivity {

    private PromotionStrategy ps;

    public PromotionActivity(PromotionStrategy ps) {
        this.ps = ps;
    }

    public void execute() {
        this.ps.doPromotion();
    }

}
