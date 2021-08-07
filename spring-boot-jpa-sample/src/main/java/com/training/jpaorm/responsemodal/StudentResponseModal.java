package com.training.jpaorm.responsemodal;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StudentResponseModal {
	private Long studentid;
	private String name;
	private int age;
	private String emailId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate doj;
	public StudentResponseModal() {
		super();
	}
	public StudentResponseModal(Long studentid, String name, int age, String emailId, LocalDate doj) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.doj = doj;
	}
	public Long getStudentid() {
		return studentid;
	}
	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "StudentResponseModal [studentid=" + studentid + ", name=" + name + ", age=" + age + ", emailId="
				+ emailId + ", doj=" + doj + "]";
	}
	
	
}
