package com.micropay.auth.service;

import com.micropay.auth.model.User;
import com.micropay.auth.repository.UserRepository;
import com.micropay.auth.config.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public String authenticate(String username, String password) {
        return userRepository.findById(username)
                .filter(user -> user.getPassword().equals(password))
                .map(user -> JwtUtil.createToken(username))
                .orElse("Invalid credentials");
    }
}
