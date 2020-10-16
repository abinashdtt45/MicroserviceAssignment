package com.abinash.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "college_id")
	private long collegeId;
	@Column(name = "name")
	private String name;
	@Column(name = "dept")
	private String dept;

	public Student() {

	}

	public Student(long id, long collegeId, String name, String dept) {
		super();
		this.id = id;
		this.collegeId = collegeId;
		this.name = name;
		this.dept = dept;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", collegeId=" + collegeId + ", name=" + name + ", dept=" + dept + "]";
	}

}
