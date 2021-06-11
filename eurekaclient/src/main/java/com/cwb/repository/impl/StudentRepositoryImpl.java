package com.cwb.repository.impl;

import com.cwb.entity.Student;
import com.cwb.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Integer,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1,new Student(1,"张三",22));
        studentMap.put(2,new Student(2,"里斯",21));
        studentMap.put(3,new Student(3,"王五",19));
    }


    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(int id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(int id) {
    studentMap.remove(id);
    }
}
