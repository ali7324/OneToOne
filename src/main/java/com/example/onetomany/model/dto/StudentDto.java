package com.example.onetomany.model.dto;

import com.example.onetomany.model.enums.StudentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private StudentStatus status;
    private AddressDto address;
}
