package com.techamigo.iot.iotbackendapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "devices")
public class Device {

    @Id
    private String id;

    private String deviceId;

    private String deviceKey;

    private String ownerId;

    private Map<String,Variable> variables;

    private Instant lastSeen;

    private boolean online;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Variable {
        private String type; // "int","float","bool","string","json"
        private String value; // store as stringified value
    }

}
