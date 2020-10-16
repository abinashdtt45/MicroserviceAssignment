package com.abinash.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abinash.consumer.model.College;

@FeignClient(name = "college-service")
public interface CollegeFeign {
	@GetMapping("/colleges/{id}")
	public ResponseEntity<College> getCollegeById(@PathVariable("id") long id);
}
