package com.kuang.demo;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.kuang.dao.User;
import com.kuang.service.USerServiceImpl;
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.kuang.controller","com.kuang.service"})
@MapperScan(basePackages = "com.kuang.dao")

public class TestShow {
	 
      public static void main(String[] args) {
		
   
    	  
    	  
	}
}
