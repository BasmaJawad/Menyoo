package com.example.menyoo.model;

import com.example.menyoo.model.enums.Subscription;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

   private String name;
   private String address;
    private String postalCode;
    private String restaurantNumber;
    private String cvr;
    private String owner_name;
    private String owner_email;
    private String owner_phone;
    private Subscription subscription;

    @Column(unique = true)
    private String qrCodeFilePath;


    @OneToMany(mappedBy = "restaurant")
    @JsonBackReference
    private Set<Menu> reservations = new HashSet<>();
    // Det er bare for at stoppe json loopet



}
