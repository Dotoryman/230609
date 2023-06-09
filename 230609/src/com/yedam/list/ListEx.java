package com.yedam.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<String> strList;
		strList = new ArrayList<String>();
		strList.add("Hell");
//		strList.add(100); 숫자는 못담지~~~
		strList.add("HighWay");
		strList.add(0, "Goood");
		
		for(int i = 0 ; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("----");
		strList.set(0, "freeze");
//		strList.remove(0);
//		strList.clear();
		for(String word : strList) {
			System.out.println(word);
		}
		long start = System.currentTimeMillis();
		strList = new ArrayList<>();
		for(int i = 0 ; i < 100000 ; i++) {
			strList.add(0, "i" + i);
		}
		long end = System.currentTimeMillis();
				System.out.printf("ArrayList 걸린시간 %d : \n", (end - start));
		
				//ArrayList VS LinkedList 방식에 따라서 속도가 차이남
		
		start = System.currentTimeMillis();
		strList = new LinkedList<String>(); // 인터페이스변수 = 모든 구현클래스
		for(int i = 0 ; i < 100000; i++) {
			strList.add(0, "i" + i);
		}
		end = System.currentTimeMillis();
				System.out.printf("LinkedList 걸린시간 %d :  \n", (end - start));
	}
}
