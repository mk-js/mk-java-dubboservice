package com.mk.dubboservice.demo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.lishengguo.dubbo.impl.DiscoveryServiceImpl;
import com.github.lishengguo.dubbo.itf.IDiscoveryService;
import org.springframework.stereotype.Component;

/**
 * Created by shenxy on 25/9/17.
 *
 */
@Component
@Service
public class DemoDubboxDiscoveryServiceImpl extends DiscoveryServiceImpl implements IDiscoveryService {

}
