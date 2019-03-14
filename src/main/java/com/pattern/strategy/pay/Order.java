package com.pattern.strategy.pay;

import com.pattern.strategy.pay.payport.Payment;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 10:10
 * @Version 1.0
 */
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        return payment.pay(this.uid, this.amount);
    }

}
