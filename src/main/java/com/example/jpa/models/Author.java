package com.example.jpa.models;

import jakarta.persistence.Entity;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
public class Author {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
