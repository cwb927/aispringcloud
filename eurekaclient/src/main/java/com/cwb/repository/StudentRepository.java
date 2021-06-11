package com.cwb.repository;

import com.cwb.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(int id);
    public void saveOrUpdate(Student student);
    public void deleteById(int id);
}
