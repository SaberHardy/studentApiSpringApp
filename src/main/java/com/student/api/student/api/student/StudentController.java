package com.student.api.student.api.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students/")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // This will have all the resources for our API
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        // @RequestBody will take the data from the request body and map it to the Student object
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long student_id) {
        studentService.deleteStudent(student_id);
    }
}
