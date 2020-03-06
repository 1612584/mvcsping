package com.example.demo.service;

import com.example.demo.model.UserApplication;
import com.example.demo.repository.UserApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserApplicationService {
    private UserApplicationRepository userApplicationRepository;

    public UserApplicationService(UserApplicationRepository userApplicationRepository) {
        this.userApplicationRepository = userApplicationRepository;
    }
    public UserApplicationService(){

    }
    public List<UserApplication> findByName(String name) {
        //return userApplicationRepository.findAllByName(name).orElse(new ArrayList<UserApplication>());
        Optional<List<UserApplication>> users =  userApplicationRepository.findAllByName(name);
        if(users.isPresent()){
            return users.get();
        }else {
            return  new ArrayList<UserApplication>();
        }
    }
}
