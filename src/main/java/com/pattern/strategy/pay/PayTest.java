package com.pattern.strategy.pay;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 10:20
 * @Version 1.0
 */
public class PayTest {

    public static void main(String[] args) {
        Order order = new Order("1", "123123", 250);
        MsgResult result = order.pay(PayStrategy.WECHAT_PAY);

        System.out.println(result);
    }

}
