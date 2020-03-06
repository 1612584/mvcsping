package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;


@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class Student {
    private  String name;
    public void displayInfor(){
        System.out.println("Hello " + this.name);
    }
}
