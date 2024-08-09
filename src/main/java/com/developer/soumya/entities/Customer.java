package com.developer.soumya.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import java.io.Serializable;

@Data
@Entity
@Table(name = "tbl_customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    private String email;
    @NaturalId
    private String mobile;
    private String country;
    private String city;
    private String address;
}
