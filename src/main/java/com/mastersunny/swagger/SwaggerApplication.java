package com.mastersunny.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.web.SpringfoxWebMvcConfiguration;


@SpringBootApplication
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}
