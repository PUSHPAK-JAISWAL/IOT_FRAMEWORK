package com.techamigo.iot.iotbackendapplication.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    private String id;

    private String email;

    private String name;

    private List<String> roles;

}
