package com.techamigo.iot.iotbackendapplication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.techamigo.iot.iotbackendapplication.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}