package io.github.lucasfreitasrocha.kafka_spring;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
        basePackages = "io.github.lucasfreitasrocha.simplebank",
        excludeFilters = {
                @ComponentScan.Filter (type = FilterType.ASSIGNABLE_TYPE, value = ApiApplication.class),
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = "io\\.github\\.lucasfreitasrocha\\.simple_bank\\.entrryPoint\\.api\\..*")
        }
)
public class ConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}
