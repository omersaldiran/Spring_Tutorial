package com.tutorial2.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Ömer",
                        30,
                        LocalDate.of(1991, Month.MAY,20),
                        "osaldiran@gmail.com"


                )
        );
    }
}
