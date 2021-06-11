package com.cwb.controller;


import com.cwb.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findall")
    public Collection<Student> findAll() {
        return restTemplate.getForObject("http://provider/student/findall",Collection.class);
    }

    @GetMapping("/index")
    public String index() {
        return restTemplate.getForObject("http://provider/student/index",String.class);
    }

}
