package com.cwb.controller;


import com.cwb.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findall")
    public Collection<Student> findAll(){
        return   restTemplate.getForEntity("http://localhost:8010/student/findall",Collection.class).getBody();
    }

    @GetMapping("/findall2")
    public Collection<Student> findAll2(){
        return   restTemplate.getForObject("http://localhost:8010/student/findall",Collection.class);
    }
}
