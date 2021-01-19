package com.example.service.impl;

import com.example.model.Student;
import com.example.service.StudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void shouldExecuteSuccess() {
        Student student = new Student();
        student.setNumber("SX001");
        student.setName("张三");
        student.setAge(11);
        student.setSex(1);
        student.setGrade(1);
        student.setClazz(2);
        studentService.save(student);

        Student s1 = studentService.selectByNumber("SX001");
        Assert.assertEquals(s1.getName(), "张三");

        s1.setName("李四");
        studentService.update(s1);
        Student s2 = studentService.selectByNumber("SX001");
        Assert.assertEquals(s2.getName(), "李四");

        studentService.delete(s2.getId());
        Student s3 = studentService.selectByNumber("SX001");
        Assert.assertNull(s3);
    }

    @Test
    public void shouldRollbackWhenThrowRuntimeException() {
        Student student = new Student();
        student.setNumber("SX001");
        student.setName("张三");
        student.setAge(11);
        student.setSex(1);
        student.setGrade(1);
        student.setClazz(2);

        try {
            studentService.saveAndUpdate(student);
        } catch (Exception e) {
            // doSomething
            System.out.println(e.getMessage());
        }

        Student s = studentService.selectByNumber("SX001");
        Assert.assertNull(s);
    }
}
