package com.studentManagement.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagement.demo.model.Course;
import com.studentManagement.demo.repository.CourseRepository;
import com.studentManagement.demo.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	 @Autowired
	    private CourseRepository courseRepository;

	    @Override
	    public Course createCourse(Course course) {
	        return courseRepository.save(course);
	    }

	    @Override
	    public Course updateCourse(Long courseNumber, String newName) {
	        Course course = courseRepository.findById(courseNumber).orElse(null);
	        if (course != null) {
	            course.setName(newName);
	            return courseRepository.save(course);
	        }
	        return null;
	    }

	    @Override
	    public void deleteCourse(Long courseNumber) {
	        courseRepository.deleteById(courseNumber);
	    }

	    @Override
	    public List<Course> getAllCourses() {
	        return courseRepository.findAll();
	    }
}
