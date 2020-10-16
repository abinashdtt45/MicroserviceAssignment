package com.abinash.consumer.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abinash.consumer.feign.CollegeFeign;
import com.abinash.consumer.feign.StudentFeign;
import com.abinash.consumer.model.College;
import com.abinash.consumer.model.Consumer;
import com.abinash.consumer.model.Student;

@RestController
public class ConsumerController {

	@Autowired
	CollegeFeign collegeFeign;
	@Autowired
	StudentFeign studentFeign;

	@GetMapping("/college/{college_id}/students")
	public ResponseEntity<Consumer> getStudents(@PathVariable("college_id") long id){
		College college = collegeFeign.getCollegeById(id).getBody();
		List<Student> students = studentFeign.findStudentsByCollegeId(id).getBody();
		List<String> studentNames = students.stream().map(x -> x.getName()).collect(Collectors.toList());
		Consumer consumer = new Consumer(college.getId(), college.getName(), studentNames);
		return new ResponseEntity<>(consumer, HttpStatus.OK);

	}
}
