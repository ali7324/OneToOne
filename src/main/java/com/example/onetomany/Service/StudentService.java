package com.example.onetomany.Service;

import com.example.onetomany.Exception.NotFoundException;
import com.example.onetomany.Mapper.AddressMapper;
import com.example.onetomany.Mapper.StudentMapper;
import com.example.onetomany.dao.entity.Repository.StudentsRepository;
import com.example.onetomany.dao.entity.StudentEntity;
import com.example.onetomany.model.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {
    private final StudentsRepository studentsRepository;
    private final AddressService addressService;
    private final StudentMapper studentMapper;

    public void  CreateStudent(StudentDto studentDto) {
        log.info("actionLog.createStudent.start for name: {} and surname : {} ", studentDto.getName() , studentDto.getSurname() );
        StudentEntity entity = StudentMapper.INSTANCE.toEntity(studentDto);
        studentsRepository.save(entity);
        log.info("actionLog.createStudent.end for name : {} and surname : {} ", studentDto.getName() , studentDto.getSurname() );
    }

    public StudentDto getStudentById(Long id) {
        log.info("actionLog.getStudentById.start for id : {} ", id );
        StudentEntity entity = studentsRepository.findById(id).orElseThrow(()->new NotFoundException("Student not found with id " + id));
        log.info("actionLog.getStudentById.end for id : {} ", id );
        return StudentMapper.INSTANCE.toDto(entity);
    }
}
