package com.springjwt.controllers;

import com.springjwt.dto.HelloResponse;
import com.springjwt.dto.UserDTO;
import com.springjwt.entities.User;
import com.springjwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse("Hello from JWT Authorization");
    }

    @GetMapping("/user")
    public UserDTO getCurrentUser(Authentication authentication) {
        String email = authentication.getName(); // берётся из токена
        User user = userRepository.findFirstByEmail(email);
        return new UserDTO(user.getId(), user.getName(), user.getEmail());
    }
}
