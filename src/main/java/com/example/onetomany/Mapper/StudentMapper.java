package com.example.onetomany.Mapper;

import com.example.onetomany.dao.entity.StudentEntity;
import com.example.onetomany.model.dto.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(target = "surname", ignore = true)
    StudentDto toDto(StudentEntity studentEntity);

    StudentEntity toEntity(StudentDto studentDto);

}
