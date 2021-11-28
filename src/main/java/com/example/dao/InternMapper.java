package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.model.Intern;

@Mapper
public interface InternMapper {
	Intern findById(@Param("dto") Intern dto);
    
    int update(@Param("dto") Intern dto);
}
