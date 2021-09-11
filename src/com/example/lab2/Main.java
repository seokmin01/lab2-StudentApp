package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
//		Student s = new Student();
//		s.setNo(1);
//		s.setName("홍길동 ");
//		s.setAge(20);
//		list.add(s);
		list.add(new Student(22000666, "정석민", 21));
		list.add(new Student(22000667, "정성호", 21));
		list.add(new Student(22000075, "김민수", 21));
		list.add(new Student(22000096, "김성준", 21));
		list.add(new Student(22000290, "박이린", 21));
		list.add(new Student(22000750, "최민서", 21));
		list.add(new Student(22000755, "최수진", 21));
		list.add(new Student(22000319, "반예지", 21));
		list.add(new Student(22000427, "오신영", 21));
		list.add(new Student(21801050, "이성은", 23));
		list.add(new Student(21600569, "이해찬", 26));
		list.add(new Student(21800116, "김에녹", 23));
		
		//오름차순 정렬
		System.out.println("Student List (ordered by name)");
		Collections.sort(list, new StudentComparator());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		System.out.println();
		//내림차순 정렬
		System.out.println("Student List (reverse ordered by name)");
		Collections.sort(list, new StudentComparatorDesc());
		for (Student ss : list) {
			System.out.println(ss.toString());
		}
		
	}
	
}
