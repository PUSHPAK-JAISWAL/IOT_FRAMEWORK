package com.techamigo.iot.iotbackendapplication.dto;

import lombok.Data;

import java.util.Map;

@Data
public class CreateDeviceRequest {

    private String deviceId;

    // optional initial variables: name -> {type,value}
    private Map<String, Map<String,String>> variables;

}
