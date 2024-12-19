package org.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into uer(name, year, month, day) VALUES (#{name}, #{year}, #{month}, #{day})")
    void addInf(String name, int year, int month, int day);
}
