package controller;


import model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.List;

@EnableWebMvc
@Configuration
public class Config {


    @Bean
    @Scope(value = WebApplicationContext.SCOPE_APPLICATION)
    public List<User> getUsers() {
        return new ArrayList<>();
    }
}