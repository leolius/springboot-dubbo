package com.example.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrivodeMainConfig {

	public static void main(String[] args) {
		SpringApplication.run(PrivodeMainConfig.class,args);
		try{
			System.in.read();
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
