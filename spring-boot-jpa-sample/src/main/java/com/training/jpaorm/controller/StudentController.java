package com.training.jpaorm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.jpaorm.requestmodal.StudentRequestModal;
import com.training.jpaorm.responsemodal.StudentResponseModal;
import com.training.jpaorm.service.StudentService;

@RestController
@RequestMapping("sms")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("register")
	public StudentResponseModal registerStudent(@RequestBody StudentRequestModal studentRequestModal) {
		System.out.println("Started Registration");
		System.out.println(studentRequestModal.toString());
		StudentResponseModal studentResponseModal = studentService.registerStudent(studentRequestModal);
		System.out.println("Response :: " + studentResponseModal.toString());
		// return studentService.registerStudent(studentRequestModal);
		return studentResponseModal;
	}

	@GetMapping("/students")
	public List<StudentResponseModal> studentsList() {
		return studentService.getListOfStudents();
	}
	
	@GetMapping("/students/{id}")
	public StudentResponseModal getStudentData(@PathVariable("id") Long id) {
		return studentService.getStudentData(id);
	}
}
