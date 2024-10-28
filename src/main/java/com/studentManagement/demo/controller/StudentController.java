package com.studentManagement.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentManagement.demo.model.Student;
import com.studentManagement.demo.repository.StudentRepository;
import com.studentManagement.demo.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/{rollNumber}")
    public Student updateStudent(@PathVariable Long rollNumber, @RequestBody String newName) {
        return studentService.updateStudent(rollNumber, newName);
    }

    @DeleteMapping("/{rollNumber}")
    public void deleteStudent(@PathVariable Long rollNumber) {
        studentService.deleteStudent(rollNumber);
    }

    @GetMapping("/find")
    public List<Student> getStudents(@RequestParam String filter, @RequestParam String value) {
        return studentService.getStudentsByFilter(filter, value);
    }
    
    @GetMapping()
    public List<Student> getAll(){
    	return studentRepository.findAll();
    }
}