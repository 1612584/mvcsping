package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Setter@Getter@NoArgsConstructor@AllArgsConstructor@Builder
public class UserApplication {
    private String name;
    private String username;
    private String password;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
