package org.example.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void addInf(String name, int year, int month, int day);
}
