package com.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//By using Entity annotation it will create Object (Student) as Table (student) in db
@Entity
//Table is used to change name of object in DB
@Table(name = "student")
public class Student

{
	@Id
	// Generated value is used to create sys generated values for specified column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sid;
	private String sname;
	private String sclass;
	private String sgrade;
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getSgrade() {
		return sgrade;
	}
	public void setSgrade(String sgrade) {
		this.sgrade = sgrade;
	}
	public Student(long sid, String sname, String sclass, String sgrade) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sclass = sclass;
		this.sgrade = sgrade;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
