package com.techamigo.iot.iotbackendapplication.repository;

import com.techamigo.iot.iotbackendapplication.entity.Otp;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OtpRepository extends MongoRepository<Otp,String> {
    Optional<Otp> findByToEmailAndCodeAndPurposeAndUsedFalse(String toEmail,String code, String purpose);
}
