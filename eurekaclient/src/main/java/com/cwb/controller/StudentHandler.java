package com.cwb.controller;

import com.cwb.entity.Student;
import com.cwb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepository studentRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findall")
    public Collection<Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/findbyid/{id}")
    public Student findById(@PathVariable("id") int id) {
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }


    @DeleteMapping("/deletebyid/{id}")
    public void deleteBuId(@PathVariable("id") int id) {
        studentRepository.deleteById(id);
    }

    @GetMapping("/index")
    public String index() {
        return "当前端口: " + this.port;
    }



}
