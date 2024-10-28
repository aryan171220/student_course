package com.studentManagement.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagement.demo.model.Student;
import com.studentManagement.demo.repository.StudentRepository;
import com.studentManagement.demo.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Long rollNumber, String newName) {
		Optional<Student> studentOpt = studentRepository.findById(rollNumber);
		if (studentOpt.isPresent()) {
			Student student = studentOpt.get();
			student.setName(newName);
			return studentRepository.save(student);
		}
		return null;
	}

	@Override
	public void deleteStudent(Long rollNumber) {
		studentRepository.deleteById(rollNumber);
	}

	@Override
	public List<Student> getStudentsByFilter(String filter, String value) {
		// Implement logic based on filter type (roll, name, etc.)
		return studentRepository.findAll();
	}

}
