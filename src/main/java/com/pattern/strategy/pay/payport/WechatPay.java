package com.pattern.strategy.pay.payport;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 10:18
 * @Version 1.0
 */
public class WechatPay extends Payment {

    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 200;
    }

}
