package com.taazsoft.examinationsystembe.student.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "student-uuid")
	@GenericGenerator(name = "student-uuid", strategy = "uuid")
	private String studentId;
	private UUID examId;
	private UUID markId;
	private String firstName;
	private String lastName;
	private String dob;
	private String guardianName;
	private String studentClass;
	private String section;
}
