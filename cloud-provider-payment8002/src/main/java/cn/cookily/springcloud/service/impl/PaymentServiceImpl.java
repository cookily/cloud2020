package cn.cookily.springcloud.service.impl;

import cn.cookily.springcloud.dao.PaymentDao;
import cn.cookily.springcloud.entities.Payment;
import cn.cookily.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cookily
 * @date 2020-10-12
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}