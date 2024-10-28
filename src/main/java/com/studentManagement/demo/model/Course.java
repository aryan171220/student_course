package com.studentManagement.demo.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	 @Id
	    @GeneratedValue(strategy = GenerationType
	    .IDENTITY)
	    private Long courseNumber;
	    
	    private String name;

	    @ManyToMany
	    private Set<Student> students;

		public Course() {
			super();
		}

		public Course(Long courseNumber, String name, Set<Student> students) {
			super();
			this.courseNumber = courseNumber;
			this.name = name;
			this.students = students;
		}

		public Long getCourseNumber() {
			return courseNumber;
		}

		public void setCourseNumber(Long courseNumber) {
			this.courseNumber = courseNumber;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set<Student> getStudents() {
			return students;
		}

		public void setStudents(Set<Student> students) {
			this.students = students;
		}
	    

}
