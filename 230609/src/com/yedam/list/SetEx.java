package com.yedam.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hell");
		set.add("Highway to");
		set.add("Hell"); //String => hashcode, equals
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
			System.out.println(set.size());
		}
		System.out.println("=====");
		for (String str : set) {
			System.out.println(str);
		}
		
		//중복된 값 제거
		Set<Integer> iSet = new HashSet<>();
		iSet.add(100);
		iSet.add(200);
		iSet.add(100);
		System.out.println("=====");
		for (Integer str : iSet) {
			System.out.println(str);
		}
		// 필독! 랜덤숫자 5개 출력하기
		// 정수를 담을 수 있는 저장공간을 만들구 정수[] 선언, 임의의 값을 저장 Math.random(1~10) : 5개 저장
		//중복저장 불가
		int[] numbers = new int[5];
		iSet = new HashSet<>();
		
		while(iSet.size() < 5) {
			iSet.add((int)(Math.random()*45 + 1));
		}
		
		int idx = 0;
		Iterator<Integer> itr = iSet.iterator();

		while (itr.hasNext()) {
			numbers[idx++] = itr.next();
		}		
		System.out.println("--- numbers ---");
		for(int i = 0 ; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
	}
}
