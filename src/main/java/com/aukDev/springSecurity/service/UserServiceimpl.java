package com.aukDev.springSecurity.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;



public class UserServiceimpl implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;

    public UserServiceimpl(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails= User.builder()
                .username("renuka")
                .password(passwordEncoder.encode("renuka"))
                .build();
        return userDetails;
    }
}
