package com.example.jpa.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "author_sequence")
    @SequenceGenerator()
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
