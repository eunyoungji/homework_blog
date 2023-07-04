package com.sparta.homeworkblog2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HomeworkBlog2Application {

	public static void main(String[] args) {
		SpringApplication.run(HomeworkBlog2Application.class, args);
	}

}
