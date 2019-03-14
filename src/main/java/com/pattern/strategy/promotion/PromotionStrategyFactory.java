package com.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 10:01
 * @Version 1.0
 */
public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> psMap = new HashMap<String, PromotionStrategy>();

    static{
        psMap.put("CASHBACK", new CashBackStrategy());
        psMap.put("COUPON", new CouponStrategy());
        psMap.put("GROUPBUY", new GroupBuyStrategy());
        psMap.put("EMPTY", new EmptyStrategy());
    }

    private PromotionStrategyFactory(){}

    public static PromotionStrategy getPromotionStrategy(String ps) {
        if(!psMap.containsKey(ps))
            return psMap.get("EMPTY");
        return psMap.get(ps);
    }

}
