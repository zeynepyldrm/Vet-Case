package com.example.vetcase.service;

import com.example.vetcase.model.User;
import com.example.vetcase.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
