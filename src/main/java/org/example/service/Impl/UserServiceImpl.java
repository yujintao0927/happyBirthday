package org.example.service.Impl;

import org.example.mapper.UserMapper;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper ;

    @Override
    public void addInf(String name, int year, int month, int day) {
        userMapper.addInf(name,year,month,day) ;
    }
}
