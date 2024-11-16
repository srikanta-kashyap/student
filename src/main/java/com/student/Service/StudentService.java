package com.student.Service;

import java.util.List;

import com.student.Entity.Student;

//service contains the methods which are implemented(Interface) and the implemention logics are hidden.

public interface StudentService 
{
	public Student fetchSingleEmployee(String Sname);

	public List<Student> fetchAllStudent();

	public String createStudent(Student student);

	public String updateStudent(Student student, String sname);

	public String deleteStudent(String empname);
}
