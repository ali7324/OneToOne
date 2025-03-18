package com.example.onetomany.Service;

import com.example.onetomany.Mapper.AddressMapper;
import com.example.onetomany.dao.entity.AddressEntity;
import com.example.onetomany.dao.entity.Repository.AddressRepository;
import com.example.onetomany.model.dto.AddressDto;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;

    public void createAddress(AddressDto addressDto) {
        AddressEntity entity = AddressMapper.toEntity(addressDto);
        addressRepository.save(entity);
    }
}
