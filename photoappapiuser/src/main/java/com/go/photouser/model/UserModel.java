package com.go.photouser.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    @NotNull(message = "firstname cannot be null")
    @Size(min=2, message =  "firstname must not be less than two characters")
    private String firstname;

    @NotNull(message = "lastname cannot be null")
    @Size(min=2, message =  "lastname must not be less than two characters")
    private String lastname;

    @NotNull(message = "password cannot be null")
    @Size(min=8, max= 16,message =  "passowrd must be equal eight and less than 16 characters")
    private String password;

    @NotNull(message = "email cannot be null")
    @Email
    private String email;

}
