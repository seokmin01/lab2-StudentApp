package com.example.lab2;
import java.util.Comparator;

public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	public Student() {}
	public Student(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
}

class StudentComparator implements Comparator <Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

class StudentComparatorDesc implements Comparator <Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.name.compareTo(o1.name);
	}
}
