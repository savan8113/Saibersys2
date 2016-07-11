package com.test.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="student")
@NamedQuery(name="student.byId", query="SELECT stu from com.test.pojo.Student stu")
public class Student {

	@Id
	private Integer sno;
	private String sname;
	private String lname;
	private String major;
	
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", lname=" + lname + ", major=" + major + "]";
	}
	public Student() {
		super();
	}
	public Student(Integer sno) {
		super();
		this.sno = sno;
	}
	public Student(Integer sno, String sname, String lname, String major) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.lname = lname;
		this.major = major;
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
