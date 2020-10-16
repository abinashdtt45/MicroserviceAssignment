package com.abinash.college.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abinash.college.model.College;
import com.abinash.college.repository.CollegeRepository;

@RestController
public class CollegeController {
	@Autowired
	CollegeRepository collegeRepository;

	@GetMapping("/colleges/{id}")
	public ResponseEntity<College> getCollegeById(@PathVariable("id") long id) {
		Optional<College> college = collegeRepository.findById(id);

		if (college.isPresent()) {
			return new ResponseEntity<>(college.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

	}

	@PostMapping("/colleges")
	public ResponseEntity<College> createCollege(@RequestBody College college) {
		try {
			College newCollege = collegeRepository
					.save(new College(college.getId(), college.getName(), college.getAddress()));
			return new ResponseEntity<>(newCollege, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
