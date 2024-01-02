package com.jp.pj.student;

public class StudentLogic 
{
	Student[] students = new Student[3];
	private int count = 0 ;
	
	public void addStudent( Student student) 
	{
		for (int i = 0; i < students.length; i++) 
		{
			if( students[i] == null )
			{
				students[i] = student ; count++ ;
				System.out.println("Student with id "+ student.getSid() + " is added to database");return;
			}
		}
	}
	public void display() 
	{
		for (int i = 0; i < students.length; i++) 
		{
			if( students[i] != null )
			{
				System.out.println( students[i] );
			}
		}
	}
	public void searchStudentById(int sid) 
	{
		for (int i = 0; i < students.length; i++) 
		{
			if( students[i] != null && students[i].getSid()==sid ) 
			{
				System.out.println( students[i] );return;
			}
		}
		System.err.println("Student with given id "+ sid + " is not available in database");	
	}
	public void searchStudentByPhone(long phone) 
	{
		boolean flag = true ;
		for (int i = 0; i < students.length; i++) 
		{
			if( students[i] != null && students[i].getPhone()== phone ) 
			{
				System.out.println( students[i] ); flag = false ;
			}
		}
		if( flag ) {
			System.err.println("Student with given number "+ phone + " is not available in database");	
		}
	}
	public void searchStudentByName(String sname)
	{
		boolean flag = true ;
		for (int i = 0; i < students.length; i++) 
		{
			if( students[i] != null && students[i].getSname().equalsIgnoreCase(sname) ) 
			{
				System.out.println( students[i] ); flag = false ;
			}
		}
		if( flag ) {
			System.err.println("Student with given Name "+ sname + " is not available in database");	
		}	
	}
	public void deleteStudentById(int sid) 
	{
		for (int i = 0; i < students.length; i++) 
		{
			if( students[i] != null && students[i].getSid()==sid ) 
			{
				students[i] = null ; count-- ;
				System.err.println("Student with given id "+ sid + " is removed from database");
				return;
			}
		}
		System.err.println("Student with given id "+ sid + " is not available in database");	
	}
	public int getCount() {
		return count;
	}
}
