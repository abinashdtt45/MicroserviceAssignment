package com.abinash.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abinash.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findStudentsByCollegeId(long collegeId);

}
