package com.test.springboot.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Jadli",
                        "Imed",
                        LocalDate.now(),
                        "imedjadli2@gmail.com",
                        25
                ),

                new Student(
                        "Bacem",
                        "Chriha",
                        LocalDate.now(),
                        "bacemchriha@gmail.com",
                        15
                ),

        new Student(
                "Ayoub",
                "Missaoui",
                LocalDate.now(),
                "ayoub@gmail.com",
                10
        )
        );
    }
}
