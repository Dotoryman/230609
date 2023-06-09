package com.yedam;

public class ObjectEx {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.equals(obj2));
		
		String str1 = new String("Hell");
		String str2 = new String("Hell");
		
		System.out.println(str1.equals(str2));
		
		Member m1 = new Member();
		Member m2 = new Member();
		
		m1.setId("user1");
		m1.setPw("11");
		m2.setId("user1");
		m2.setPw("11");
		
		System.out.println(m1.equals(m2));
		
		// toString()
		System.out.println(m1.toString());
		System.out.println(m2); //toString()이 숨어있다
		
		System.out.println(m2.getClass().getName());
		System.out.println(m2.getClass().getResource("SetEx.class"));
	}
}
