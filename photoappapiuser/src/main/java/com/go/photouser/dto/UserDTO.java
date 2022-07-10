package com.go.photouser.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String userId;
    private String encryptedPassword;
}
