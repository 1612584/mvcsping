package com.example.demo;

import com.example.demo.model.UserApplication;
import com.example.demo.repository.UserApplicationRepository;
import com.example.demo.service.UserApplicationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class TestService {
//    @TestConfiguration
//    static class UserServiceTest{
//        @Bean
//        public UserApplicationService userApplicationService(){
//            return new UserApplicationService();
//        }
//    }
    @Autowired
    private UserApplicationService applicationService;

    @Autowired
    private UserApplicationRepository userApplicationRepository;

    @Test
    public void testFindUserByName(){
        List<UserApplication> userApplicationList = applicationService.findByName("tam");
        if(!userApplicationList.isEmpty()) {
            userApplicationList.forEach(userApplication -> {
                assertThat(userApplication.getName()).isEqualTo("tam");
            });
        }}
}
