package com.tutorial2.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ömer = new Student("Ömer",

                    LocalDate.of(1988, MAY, 1),
                    "osaldiran@gmail.com"
            );
            Student kadir = new Student(
                    "Kadir",

                    LocalDate.of(1995, MARCH, 1),
                    "ksaldiran@gmail.com"
            );

            repository.saveAll(
                    List.of(ömer,kadir)
            );
        };
    }
}
