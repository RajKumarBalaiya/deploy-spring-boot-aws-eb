/**
 * 
 */
package com.springboot.elasticbeanstalk.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.elasticbeanstalk.app.model.StudentModel;
import com.springboot.elasticbeanstalk.app.service.Student_Service;

/**
 * @author Raj
 *
 */
@RestController
@RequestMapping("/aws")
@CrossOrigin("*")
public class StudentController {

	@Autowired
	private Student_Service studentservice;

	@PostMapping("save-student")
	public StudentModel saveStudent(@RequestBody StudentModel student) {
		return studentservice.saveStudent(student);

	}

	@GetMapping("students-list")
	public List<StudentModel> allstudents() {
		return studentservice.getStudents();
	}

	@DeleteMapping("delete-student/{student_id}")
	public void deleteStudent(@PathVariable("student_id") int student_id, StudentModel student) {
		student.setStudent_id(student_id);
		studentservice.deleteStudent(student);
	}

	@GetMapping("student/{student_id}")
	public List<StudentModel> allstudentByID(@PathVariable("student_id") int student_id, StudentModel student) {
		student.setStudent_id(student_id);
		List<StudentModel> studentModels = new ArrayList<StudentModel>();
		studentModels.add(studentservice.getStudentByID(student));
		return studentModels;

	}

	@PostMapping("update-student/{student_id}")
	public StudentModel updateStudent(@RequestBody StudentModel student, @PathVariable("student_id") int student_id) {
		student.setStudent_id(student_id);
		return studentservice.updateStudent(student);
	}

	@GetMapping("/healthCheck")
	public String healthCheck() {
		return "Code Pipeline";
	}
}
