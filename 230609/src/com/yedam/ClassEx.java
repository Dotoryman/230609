package com.yedam;

import java.lang.reflect.Method;

public class ClassEx {
	public static void main(String[] args) {
		Class cls = Member.class;
		try {
			cls = Class.forName("com.yedam.Member");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Member m1 = new Member();
		cls = m1.getClass();
		
		System.out.println(cls.getName());
		cls.getDeclaredMethods();
		
		Method[] methods = cls.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
