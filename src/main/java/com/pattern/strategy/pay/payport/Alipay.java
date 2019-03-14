package com.pattern.strategy.pay.payport;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 10:18
 * @Version 1.0
 */
public class Alipay extends Payment {
    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
