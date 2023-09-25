package com.javatechie.springboot.service;

import com.javatechie.springboot.entity.UserCredential;

public interface AuthService {

    String saveUser(UserCredential userCredential);
}
