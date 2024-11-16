package com.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.Entity.Student;
import com.student.Service.StudentService;

@RestController
//restcontroller is used for handilling http web request

@RequestMapping("/com/student")
//requestmapping is used for defining root url for specific controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/hello")
	public String hello() {
		return "Welcome to Student Management";
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Enter you Id:";
	}

	@PostMapping("/createstudent")
	public ResponseEntity<String> createstudent(@RequestBody Student student) {

		String response = studentService.createStudent(student);

		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}

	@GetMapping("/fetchAllstudent")
	public ResponseEntity<List<Student>> fetchAllEmployees() {

		List<Student> students = studentService.fetchAllStudent();

		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	@GetMapping("/fetchsinglestudent")
	public ResponseEntity<Student> fetchsinglestudent(@RequestParam(name = "sname") String sname) {
		
		Student result = this.studentService.fetchSingleEmployee(sname);

		System.out.println(result);

		return new ResponseEntity<Student>(result, HttpStatus.OK);
	}

	@PutMapping("/updatestudent")
	public ResponseEntity<String> updatestudent(@RequestBody Student std, @RequestParam("sname") String sname) {

		String response = studentService.updateStudent(std, sname);

		return new ResponseEntity<String>(response, HttpStatus.OK);

	}

	@DeleteMapping("/deletestudent")
	public ResponseEntity<String> deleteEmployee(@RequestParam("sname") String sname) {
		String response = studentService.deleteStudent(sname);

		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

}
