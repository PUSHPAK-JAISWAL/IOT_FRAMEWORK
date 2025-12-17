package com.techamigo.iot.iotbackendapplication.repository;

import com.techamigo.iot.iotbackendapplication.entity.Otp;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface OtpRepository extends MongoRepository<Otp,String> {
    Optional<Otp> findByToEmailAndCodeAndPurposeAndUserFalse(String toEmail,String code, String purpose);
}
