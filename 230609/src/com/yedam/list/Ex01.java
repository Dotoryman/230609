package com.yedam.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student {
	int studentNum;
	String name;

	Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
//	학생번호가 동일하면 같은값을 반환
//	return super.hashCode();
		return this.studentNum;
	}

	@Override
	public boolean equals(Object obj) {
//		학생번호가 동일하면 true.
//		return super.equals(obj);
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(this.studentNum == std.studentNum) {
				return true;
			}
		}
		return false;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		//학생번호는 고유값(중복X)
		Set<Student> students = new HashSet<>();
		
		students.add(new Student(1, "존스"));
		students.add(new Student(2, "잭"));
		students.add(new Student(1, "카타리나"));
		
		Iterator<Student> iter = students.iterator();
		while(iter.hasNext()) {
			Student result = iter.next();
			System.out.printf("%d : %s \n", result.studentNum, result.name);
		}
	}
}
