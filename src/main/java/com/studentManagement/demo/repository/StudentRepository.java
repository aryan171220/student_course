package com.studentManagement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentManagement.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
