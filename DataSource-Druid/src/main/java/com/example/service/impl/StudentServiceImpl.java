package com.example.service.impl;

import com.example.mapper.StudentMapper;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public int save(Student student) {
        return studentMapper.save(student);
    }

    public Student selectByNumber(String number) {
        return studentMapper.selectByNumber(number);
    }

    public int update(Student student) {
        return studentMapper.update(student);
    }

    public int delete(long id) {
        return studentMapper.delete(id);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int saveAndUpdate(Student student) {
        save(student);

        // 抛java.lang.NumberFormatException
        Long.valueOf(student.getNumber()) ;

        update(student);

        return 1;
    }
}
