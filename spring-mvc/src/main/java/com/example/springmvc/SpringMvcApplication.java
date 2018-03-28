package com.example.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}
	/*
发送消息
	 */
	public static  void sendMsg(String msg)
	{
		System.console().printf("msg:"+msg);
	}
}
