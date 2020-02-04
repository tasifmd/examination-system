package com.taazsoft.examinationsystembe.marks.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.taazsoft.examinationsystembe.exam.model.Exam;

import lombok.Data;

@Data
@Entity
@Table
public class Mark {
	@Id
	@GeneratedValue
	private UUID markId;
	private String subjectName;
	private int maxMarks;
	private int gotMarks;
	private String grade;

}
