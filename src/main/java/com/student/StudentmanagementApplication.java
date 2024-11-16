package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);
	}

}


//All the package must be inside the com.student
//com.student .controller
//com.student.Entity(class)
//com.student.Repository(Interface)user defined methods such as search by name
//com.student.service(Interface)methods are shown
//com.student.serviceImpl(class)method implementation