package com.mk.dubboservice.demo.impl.demo;

import com.alibaba.dubbo.config.annotation.Service;
import com.mk.dubboservice.demo.itf.IDemoService;
import org.springframework.stereotype.Component;

/**
 * Created by shenxy on 27/9/17.
 */
@Component
@Service
public class ExpenseDemoServiceImpl implements IDemoService {
    @Override
    public String hi() {
        return "**response from demo java service**    ";
    }
}
