package com.example.onetomany.Mapper;

import com.example.onetomany.dao.entity.AddressEntity;
import com.example.onetomany.model.dto.AddressDto;

public class AddressMapper {
    public static AddressEntity toEntity(AddressDto addressDto) {
        var entity = new AddressEntity();
        entity.setCity(addressDto.getCity());
        entity.setStreet(addressDto.getStreet());
        return entity;
    }

    public static AddressDto toDto(AddressEntity addressEntity) {
        var dto = new AddressDto();
        dto.setCity(addressEntity.getCity());
        dto.setStreet(addressEntity.getStreet());
        return dto;
    }
}
