package cn.cookily.springcloud.service;

import cn.cookily.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author cookily
 * @date 2020-10-12 17:12
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}