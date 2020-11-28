package com.cvbuilder.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages="com.cvbuilder.api")
@EntityScan("com.cvbuilder")
@EnableJpaRepositories("com.cvbuilder.dao")
public class CVBuilderAPI extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(CVBuilderAPI.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(CVBuilderAPI.class);
	}
}
