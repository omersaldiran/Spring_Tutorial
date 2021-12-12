package com.tutorial2.demo.teacher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class TeacherConfig {
    @Bean
    CommandLineRunner commandLineRunners(TeacherRepository repository){
        return args -> {
            Teacher omer = new Teacher("Ömer","Master","osaldiran@saldiran.com",LocalDate.of(1991,05,05)
            );

            repository.saveAll(List.of(omer)
            );
        };
    }
}
