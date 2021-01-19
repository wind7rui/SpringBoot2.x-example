package com.example.service;

import com.example.model.Student;

public interface StudentService {
    int save(Student student);

    Student selectByNumber(String number);

    int update(Student student);

    int delete(long id);

    int saveAndUpdate(Student student);
}
