package com.aukDev.springSecurity;

import com.aukDev.springSecurity.service.JWTService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
		JWTService jwtService=new JWTService();
		System.out.println(jwtService.getJWTTokeb());
	}

}
