package com.taazsoft.examinationsystembe.student.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Student {
	@Id
	@GeneratedValue
	private UUID studentId;
	private UUID examId;
	private UUID markId;
	private String firstName;
	private String lastName;
	private String dob;
	private String guardianName;
	private String studentClass;
	private String section;
}
