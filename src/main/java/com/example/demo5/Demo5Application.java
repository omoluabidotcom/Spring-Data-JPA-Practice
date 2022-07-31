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

            Student umar = new Student("Umar", "Yahaya", "farooq@gmail.com", 10, "Abuja");
            studentRepository.save(umar);

            Student khalid = new Student("Khalid", "Yahaya", "khalid@gmail.com", 17, "Abuja");
            studentRepository.save(khalid);

            Student abdulmalik = new Student("Abdulmalik", "Yahaya", "abdul@gmail.com", 20, "Abuja");
            studentRepository.save(abdulmalik);

            Student habib = new Student("Habib", "Yahaya", "habib@gmail.com", 23, "Abuja");
            studentRepository.save(habib);

            Student yahaya = new Student("Yahaya", "Yusuf", "yakson@gmail.com", 25, "Abuja");
            studentRepository.save(yahaya);
        };
    }

    @GetMapping
    public String hello() {

        return "Hello World";
    }

}
