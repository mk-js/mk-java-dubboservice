package com.mk.dubboservice.demo.itf;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shenxy on 27/9/17.
 *
 * demo interface for mk-dubboservice
 */
@RequestMapping("/demo")
public interface IDemoService {
    @RequestMapping("/demojava")
    String hi();
}
