package com.example.demo.repository;

import com.example.demo.model.UserApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserApplicationRepository extends JpaRepository<UserApplication, Long> {
    Optional<List<UserApplication>> findAllByName(String name);

}
