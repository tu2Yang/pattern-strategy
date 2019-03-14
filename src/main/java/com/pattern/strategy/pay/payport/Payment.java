package com.pattern.strategy.pay.payport;

import com.pattern.strategy.pay.MsgResult;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 10:15
 * @Version 1.0
 */
public abstract class Payment {

    public abstract String getName();

    protected abstract double queryBalance(String uid);

    public MsgResult pay(String uid, double amount) {
        if(queryBalance(uid) < amount) {
            return new MsgResult(500, "支付失败", "余额不足");
        }
        return new MsgResult(200, "支付成功", "支付金额:" + amount);
    }

}
