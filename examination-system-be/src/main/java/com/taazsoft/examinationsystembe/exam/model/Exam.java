package com.taazsoft.examinationsystembe.exam.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table
public class Exam implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "exam-uuid")
	@GenericGenerator(name = "exam-uuid", strategy = "uuid")
	private String examId;
	private String examName;
	private String StartDate;
	private String endDate;
	private boolean isFinalExam;
}
