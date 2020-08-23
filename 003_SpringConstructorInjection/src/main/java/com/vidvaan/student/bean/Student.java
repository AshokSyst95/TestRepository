package com.vidvaan.student.bean;

public class Student {

	private int sid;
	private String sname;

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public void display() {
		System.out.println("Student id :" + sid + "Student name :" + sname);
	}

}
