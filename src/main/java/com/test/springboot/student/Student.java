package com.test.springboot.student;

import java.time.LocalDate;

public class Student {

    private String firstName;

    private String lastName;

    private LocalDate birth;

    private String email;

    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String firstName, String lastName, LocalDate birth, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.email = email;
        this.age = age;
    }

    public Student() {
    }
}
