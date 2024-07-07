package com.student.api.student.api.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student hardy = new Student(
                    "hardy",
                    "hardy@gmail.com",
                    LocalDate.of(1990, Month.FEBRUARY, 5));

            Student don = new Student(
                    "don",
                    "don@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5));

            studentRepository.saveAll(List.of(hardy, don));
        };
    }
}
