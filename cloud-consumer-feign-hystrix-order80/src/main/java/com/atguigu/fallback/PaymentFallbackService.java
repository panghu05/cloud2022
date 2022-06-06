package com.atguigu.fallback;

import com.atguigu.server.PaymentHystrixService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }
    @Override
    public String payment_Timeout(Integer id) {
        return "-----单独踢出来的兜底信息 fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}

