package com.taazsoft.examinationsystembe.exam.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Exam {
	@Id
	@GeneratedValue
	private UUID examId;
	private String examName;
	private String StartDate;
	private String endDate;
	private boolean isFinalExam;
}
