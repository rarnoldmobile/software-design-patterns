package com.example.rarnoldmobile.classes;

public class School {

	private String schoolName;
	private Integer studentCount;
	private Integer teacherCount;
	
	public School(String schoolName, Integer studentCount, Integer teacherCount) {
		this.setSchoolName(schoolName);
		this.setStudentCount(studentCount);
		this.setTeacherCount(teacherCount);
	}
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Integer getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(Integer studentCount) {
		this.studentCount = studentCount;
	}

	public Integer getTeacherCount() {
		return teacherCount;
	}

	public void setTeacherCount(Integer teacherCount) {
		this.teacherCount = teacherCount;
	}
	
	
	
}
