package com.example.demo5;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo5Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo5Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(studentRepository studentRepository) {

        return  args -> {
            Student hajara = new Student("Hajara", "Yahaya", "hajo@gmail.com", 13, "Abuja");
            studentRepository.save(hajara);
        };
    }

    @GetMapping
    public String hello() {

        return "Hello World";
    }

}
