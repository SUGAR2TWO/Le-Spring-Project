package com.su2ar.LeSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LeSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeSpringProjectApplication.class, args);
	}

}
