package com.studentManagement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentManagement.demo.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}