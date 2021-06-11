package com.cwb.feign;

import com.cwb.entity.Student;
import com.cwb.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;


@FeignClient(value = "provider" ,fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findall")
    public Collection<Student> findAll();


    @GetMapping("/student/index")
    public String index();
}
