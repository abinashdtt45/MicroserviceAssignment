package com.abinash.consumer.model;

import java.util.List;

public class Consumer {

	private long collegeId;
	private String collegeName;
	private List<String> studentName;

	public Consumer() {
		// TODO Auto-generated constructor stub
	}

	public Consumer(long collegeId, String collegeName, List<String> studentName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.studentName = studentName;
	}

	public long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public List<String> getStudentName() {
		return studentName;
	}

	public void setStudentName(List<String> studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Consumer [collegeId=" + collegeId + ", collegeName=" + collegeName + ", studentName=" + studentName
				+ "]";
	}

}
