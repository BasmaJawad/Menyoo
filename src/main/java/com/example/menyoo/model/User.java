package com.example.menyoo.model;


import com.example.menyoo.model.enums.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    private String username;
   private String password;
    private UserType userType;

}
