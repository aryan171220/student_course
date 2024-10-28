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
import org.springframework.web.bind.annotation.RestController;

import com.studentManagement.demo.model.Course;
import com.studentManagement.demo.services.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping
	public Course createCourse(@RequestBody Course course) {
		return courseService.createCourse(course);
	}

	@PutMapping("/{courseNumber}")
	public Course updateCourse(@PathVariable Long courseNumber, @RequestBody String newName) {
		return courseService.updateCourse(courseNumber, newName);
	}

	@DeleteMapping("/{courseNumber}")
	public void deleteCourse(@PathVariable Long courseNumber) {
		courseService.deleteCourse(courseNumber);
	}

	@GetMapping
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}
}