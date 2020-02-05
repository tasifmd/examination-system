package com.taazsoft.examinationsystembe.student.dto;

import lombok.Data;

@Data
public class StudentDto {
	private String firstName;
	private String lastName;
	private String dob;
	private String guardianName;
	private String studentClass;
	private String section;
}
