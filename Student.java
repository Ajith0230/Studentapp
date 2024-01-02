package com.jp.pj.student;

public class Student 
{
	private int sid ;
	private String sname ;
	private long phone ;
	public Student() {	}
	public Student(int sid, String sname, long phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.phone = phone;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", phone=" + phone + "]";
	}
}