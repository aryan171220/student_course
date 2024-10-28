package com.studentManagement.demo.services;

import java.util.List;

import com.studentManagement.demo.model.Student;

public interface StudentService {
	 Student addStudent(Student student);
	    Student updateStudent(Long rollNumber, String newName);
	    void deleteStudent(Long rollNumber);
	    List<Student> getStudentsByFilter(String filter, String value);
}
