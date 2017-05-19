package com.techprimers.jpa.springjpahibernateexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.techprimers.jpa.springjpahibernateexample.repository")
@SpringBootApplication
public class SpringJpaHibernateExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateExampleApplication.class, args);
	}
}
