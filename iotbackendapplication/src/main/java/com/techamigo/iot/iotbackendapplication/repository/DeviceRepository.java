package com.techamigo.iot.iotbackendapplication.repository;

import com.techamigo.iot.iotbackendapplication.entity.Device;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DeviceRepository extends MongoRepository<Device,String> {
    Optional<Device> findByDeviceKey(String deviceKey);
    Page<Device> findByOwnerId(String OwnerId, Pageable pageable);
    Page<Device> findByDeviceIdContainingIgnoreCase(String query,Pageable pageable);
}
