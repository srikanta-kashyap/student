package com.student.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Entity.Student;
import com.student.Exceptions.GenericException;
import com.student.Exceptions.StudentNotFoundException;
import com.student.Repository.StudentRepository;
import com.student.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student fetchSingleEmployee(String Sname) {

		Student student = this.studentRepository.findBySname(Sname);

		System.out.println("Student Info  " + student);

		if (student != null) {
			return student;
		}

		else {
			throw new StudentNotFoundException(562389, "Student does not Exist..!", "Srikanta");

		}

	}

	@Override
	public List<Student> fetchAllStudent() {

		List<Student> students = studentRepository.findAll();

		System.out.println("Student : " + students);

		if (students.isEmpty()) {

			throw new GenericException(85082, "No Data found pls check with admins..!", "vinay");
		}

		return students;
	}

	@Override
	public String createStudent(Student student) {

		Student student2 = studentRepository.findBySname(student.getSname());

		if (student2 == null) {
			studentRepository.save(student);

			return "Student created";
		} else {
			return "student already found";
		}
	}

	@Override
	public String updateStudent(Student std, String sname)

	{

		Student checkstudent = studentRepository.findBySname(sname);

		if (checkstudent != null) {

			checkstudent.setSname(std.getSname());
			checkstudent.setSclass(std.getSclass());
			checkstudent.setSgrade(std.getSgrade());

			studentRepository.save(checkstudent);

			return "Student records Updated Successfully";
		}

		else {

			return "student Not Found can't perform Update Operations";
		}
	}

	@Override
	public String deleteStudent(String sname)

	{
		Student student = studentRepository.findBySname(sname);

		if (student != null) {

			studentRepository.delete(student);

			return "Employee Deleted Successfully";
		} else {
			{
				return "Employee Not Found can't perform Delete Operations";
			}
		}

	}

}
