package com.abinash.consumer.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abinash.consumer.model.Student;

@FeignClient(name = "student-service")
public interface StudentFeign {

	@GetMapping("/college/students/{college_id}")
	public ResponseEntity<List<Student>> findStudentsByCollegeId(@PathVariable("college_id") long id);

}
