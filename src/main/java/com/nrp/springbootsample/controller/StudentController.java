package com.nrp.springbootsample.controller;

import com.nrp.springbootsample.model.Student;
import com.nrp.springbootsample.request.StudentRequest;
import com.nrp.springbootsample.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody @Valid StudentRequest studentRequest) {
        return studentService.saveStudent(studentRequest);
    }

    @GetMapping("/students/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable(value = "studentId") int studentId) {
        return studentService.getStudentById(studentId);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudentByName(@RequestParam(value = "studentName") String studentName){
        return studentService.getStudentByName(studentName);
    }

    @PutMapping("/students/{studentId}")
    public ResponseEntity<Student> updateStudentDetails(@PathVariable("studentId") String studentId, @RequestBody StudentRequest studentRequest){
        return studentService.updateStudentDetails(studentId, studentRequest);

    }

    @DeleteMapping("/students/{studentId}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable(value = "studentId") int studentId) {
        return studentService.deleteStudent(studentId);

    }

    @DeleteMapping("/students")
    public ResponseEntity<HttpStatus> deleteAllStudents() {
        return studentService.deleteAllStudents();

    }
}
