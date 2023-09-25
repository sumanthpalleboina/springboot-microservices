package com.javatechie.springboot.config.service;

import com.javatechie.springboot.config.entity.CustomUserDetails;
import com.javatechie.springboot.entity.UserCredential;
import com.javatechie.springboot.repository.UserCredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserCredentialRepository userCredentialRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserCredential> userCredential=userCredentialRepository.findByName(username);
        return userCredential.map(CustomUserDetails::new).orElseThrow(()->new UsernameNotFoundException("User not found with name ->"+username));
    }
}
