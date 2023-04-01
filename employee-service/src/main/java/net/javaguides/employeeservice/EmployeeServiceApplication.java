package net.javaguides.employeeservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(
        info = @Info(
                title = "API Documentation for Employee Service",
                description = "This documentation is only related to employee microservice",
                version = "0.1",
                contact = @Contact(
                        name = "Anil Kumar",
                        email = "test@test.com",
                        url = "https.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "testApa.cohhh"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Spring Boot Employee Service Documentation",
                url = "test.com"
        )
)
public class EmployeeServiceApplication {

    // Spring Beans: these beans are registered in Spring IoC container
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

}
