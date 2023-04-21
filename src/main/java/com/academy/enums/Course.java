package com.academy.enums;

public enum Course {
	
	PROGRAMMING("Programming"),
	HEALT("Health"),
	HUMANITIES("Humanities"),
	SOCIALSCIENCES("Social Sciences");
	
	private String course;
	
	private Course(String course) {
		this.course = course;
	}
}
