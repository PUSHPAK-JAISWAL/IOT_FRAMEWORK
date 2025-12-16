package com.techamigo.iot.iotbackendapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection="otps")
public class Otp {

    @Id
    private String id;

    private String toEmail;

    private String code;

    private Instant expiresAt;

    private String purpose; // user-register, device create

    private boolean used = false;

}
