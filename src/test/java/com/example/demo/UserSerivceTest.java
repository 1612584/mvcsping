package com.example.demo;

import com.example.demo.model.UserApplication;
import com.example.demo.repository.UserApplicationRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class UserSerivceTest {
//    @Autowired
//    private TestEntityManager entityManager;

    @Autowired
    private UserApplicationRepository userApplicationRepository;

    @Test
    public void whenFindUsersByName_thenReturnListUser(){
//        UserApplication userApplication = new UserApplication();
//        userApplication.setName("ta1m");
//        entityManager.persist(userApplication);
//        entityManager.flush();
        Optional<List<UserApplication>> foundUser = userApplicationRepository.findAllByName("tam");
        if(foundUser.isPresent()){
            List <UserApplication> users= foundUser.get();
            users.forEach(user -> {
                System.out.println(user.getName());
                assertThat(user.getName()).isEqualTo("tam");
            });
        }
    }
}
