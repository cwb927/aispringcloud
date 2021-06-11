package com.cwb.feign.impl;

import com.cwb.entity.Student;
import com.cwb.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;


@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中。。。 chocolate";
    }
}
