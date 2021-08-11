package com.emp.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.emp.demo.Model.Teacher;
import com.emp.demo.Service.TeacherSeivice;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {
	
	
	String name;
	@Autowired
	private TeacherSeivice teacherService;
	
	@PostMapping()
	public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher){
		return new ResponseEntity<Teacher>(teacherService.saveTeacher(teacher), HttpStatus.CREATED);
}}
	
	//
