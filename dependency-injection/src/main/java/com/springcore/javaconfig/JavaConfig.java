package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcore.javaconfig")
public class JavaConfig {

//	@Bean
//	public Samosa getSamosa() {
//		return new Samosa();
//	}
//	@Autowired
//	Samosa samosa;

	@Bean
	Student getStudent() {
		Student student = new Student();
		return student;
	}
}
