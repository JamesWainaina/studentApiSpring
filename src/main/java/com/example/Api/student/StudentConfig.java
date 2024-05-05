package com.example.Api.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository reposittory)
    {
        return args -> {
            Student Henry = new Student(
                    "Henry",
                    "henry@gmailcom",
                    LocalDate.of(2002, Month.JANUARY, 5));
            Student mariam=  new Student(
                    "mariam",
                    "mariam@gmailcom",
                    LocalDate.of(1999, Month.JANUARY, 5)

            );
            Student Kariuki=  new Student(
                    "karuki",
                    "kariuki@gmailcom",
                    LocalDate.of(1978, Month.JANUARY, 5)
            );
            Student Alex = new Student(
                    "Alex",
                    "alex@gmailcom",
                    LocalDate.of(2017, Month.JANUARY, 5)
            );

            reposittory.saveAll(
                    List.of(mariam, Alex, Henry, Kariuki)
            );
        };

    }
}
