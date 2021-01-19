package com.example.mapper;

import com.example.model.Student;
import org.apache.ibatis.annotations.*;

@Mapper
public interface StudentMapper {

    @Insert("insert into student (number,name,age,sex,grade,clazz) values (#{number},#{name},#{age},#{sex},#{grade},#{clazz})")
    int save(Student student);

    @Select("select * from student where number = #{number}")
    Student selectByNumber(String number);

    @Update("update student set number = #{number},name=#{name},age=#{age},sex=#{sex},grade=#{grade},clazz=#{clazz} where id = #{id}")
    int update(Student student);

    @Delete("delete from student where id = #{id}")
    int delete(long id);
}
