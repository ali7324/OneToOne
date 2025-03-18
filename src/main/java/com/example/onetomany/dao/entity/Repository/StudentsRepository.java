package com.example.onetomany.dao.entity.Repository;

import com.example.onetomany.dao.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository extends CrudRepository<StudentEntity, Long> {

}
