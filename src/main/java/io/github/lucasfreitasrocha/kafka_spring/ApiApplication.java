package io.github.lucasfreitasrocha.kafka_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
		basePackages = "io.github.lucasfreitasrocha.simplebank",
		excludeFilters = {
				@ComponentScan.Filter (type = FilterType.ASSIGNABLE_TYPE, value = ApiApplication.class),
				@ComponentScan.Filter(
						type = FilterType.REGEX,
						pattern = "io\\.github\\.lucasfreitasrocha\\.simple_bank\\.entrryPoint\\.consumer\\..*")
		}
)
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
