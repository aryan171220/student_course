package com.studentManagement.demo.services;

import java.util.List;

import com.studentManagement.demo.model.Course;

public interface CourseService {
    Course createCourse(Course course);
    Course updateCourse(Long courseNumber, String newName);
    void deleteCourse(Long courseNumber);
    List<Course> getAllCourses();
}