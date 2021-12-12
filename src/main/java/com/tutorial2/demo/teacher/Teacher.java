package com.tutorial2.demo.teacher;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Teacher {

    @Id
    @SequenceGenerator(name="teacherSequence",sequenceName = "teacherSequence",allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="teacherSequence")
    private Long id;
    private String name;
    private String degree;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Teacher(){

    }

    public Teacher(Long id, String name, String degree, String email, LocalDate dob, Integer age){
        this.id = id;
        this.name = name;
        this.degree = degree;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
    public Teacher(Long id, String name, String degree, String email,LocalDate dob){
        this.id = id;
        this.name = name;
        this.degree = degree;
        this.email = email;
        this.dob = dob;
    }

    public Teacher(String name, String email, LocalDate dob){
        this.name = name;
        this.dob = dob;
        this.email = email;
    }
    public Teacher(String name, String degree,String email, LocalDate dob){
        this.name = name;
        this.degree = degree;
        this.dob = dob;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
