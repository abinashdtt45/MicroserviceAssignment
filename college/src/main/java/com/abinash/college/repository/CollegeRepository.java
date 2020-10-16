package com.abinash.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abinash.college.model.College;

public interface CollegeRepository extends JpaRepository<College, Long> {



}
