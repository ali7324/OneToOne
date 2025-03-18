package com.example.onetomany.Mapper;

import com.example.onetomany.dao.entity.StudentEntity;
import com.example.onetomany.model.dto.StudentDto;

public class StudentMapper {
    public static StudentEntity toEntity(StudentDto studentDto) {
        var student =  new StudentEntity();
        student.setName(studentDto.getName());
        student.setSurname(studentDto.getSurname());
        student.setAge(studentDto.getAge());
        student.setStatus(studentDto.getStatus());

        var addressEntity = AddressMapper.toEntity(studentDto.getAddress());
        student.setAddress(addressEntity);

        return student;
    }

    public static StudentDto toDto(StudentEntity studentEntity) {
        var studentDto = new StudentDto();
        studentDto.setId(studentEntity.getId());
        studentDto.setName(studentEntity.getName());
        studentDto.setSurname(studentEntity.getSurname());
        studentDto.setAge(studentEntity.getAge());
        studentDto.setStatus(studentEntity.getStatus());

        return studentDto;
    }
}
