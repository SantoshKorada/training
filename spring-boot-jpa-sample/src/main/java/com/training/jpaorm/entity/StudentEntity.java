package com.training.jpaorm.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student", schema = "training")
public class StudentEntity {

	@Column(name = "studentid")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentid;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "emailid")
	private String emailId;

	@Column(name = "doj")
	private LocalDate doj;

	public StudentEntity() {
		super();
	}


	public StudentEntity(Long studentid, String name, int age, String emailId, LocalDate doj) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.doj = doj;
	}
	
	


	public StudentEntity(String name, int age, String emailId, LocalDate doj) {
		super();
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
		return "Student [studentid=" + studentid + ", name=" + name + ", age=" + age + ", emailId=" + emailId + ", doj="
				+ doj + "]";
	}

	
	
}
