package com.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{
	public Student findBySname(String Sname);

}
