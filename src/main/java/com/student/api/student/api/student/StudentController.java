package com.student.api.student.api.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students/")
public class StudentController {
    // This will have all the resources for our API
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Don", "Don@gmail.com",
                        LocalDate.of(1990, Month.JANUARY, 1), 21),

                new Student(2L, "Jane", "Jane@gmail.com",
                        LocalDate.of(1940, Month.DECEMBER, 1), 80)
        );
    }
}
