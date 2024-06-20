package com.spring.jwttoken.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    @NotBlank
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String name;
}
