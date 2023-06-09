package com.yedam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		// 1. ArrayList<T>
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hell");
		list.add("of the world");
		list.add("Hell\n");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		// 2. Set<T> 중복값은 제외하고 출력하는거
		Set<String> set = new HashSet<String>();
		set.add("Hell");
		set.add("of the world");
		set.add("Hell\n");
		
		for(String str : set) {
			System.out.println(str);
		}
		
		System.out.println("----");
		
		Set<Member> members = new HashSet<>();
		members.add(new Member("user1", "1111"));
		members.add(new Member("user2", "2222"));
		members.add(new Member("user1", "1111")); //set 쓰더라도 Hashcode
		
		for(Member member : members) {
			System.out.println(member.getId() + " , " + member.getPw());
		}
		
	}
}
