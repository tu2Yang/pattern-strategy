package com.pattern.strategy.pay;

import com.pattern.strategy.pay.payport.Alipay;
import com.pattern.strategy.pay.payport.Payment;
import com.pattern.strategy.pay.payport.WechatPay;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 10:22
 * @Version 1.0
 */
public class PayStrategy {

    public static final String ALI_PAY = "Alipay";
    public static final String WECHAT_PAY = "WechatPay";

    private static Map<String, Payment> map = new HashMap<String, Payment>();

    static {
        map.put(ALI_PAY, new Alipay());
        map.put(WECHAT_PAY, new WechatPay());
    }

    public static Payment get(String payKey) {
        if(map.containsKey(payKey))
            return map.get(payKey);
        return map.get(ALI_PAY);
    }

}
