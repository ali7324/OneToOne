package com.example.onetomany.dao.entity.Repository;

import com.example.onetomany.dao.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository  extends CrudRepository<AddressEntity, Long> {
}
