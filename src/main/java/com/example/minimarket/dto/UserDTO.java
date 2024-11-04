package com.example.minimarket.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private String loginId;
    private String username;
    private String email;
    private Boolean emailVerified;
    private String role;
}
