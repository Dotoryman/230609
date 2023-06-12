package com.yedam.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("user1", 96);
		map.put("user2", 88);
		map.put("user3", 92);

		String name = ""; // 최고점수를 받은 이름
		int maxScore = 0; // 최고점수저장
		int totalScore = 0; // 점수합계 저장
		//1번방법
		Set<String> set = map.keySet(); // key의 set 컬렉션
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer val = map.get(key);
			if (val > maxScore) {
				maxScore = val;
				name = key;
			}
			totalScore += val;
		}
		//2번방법
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entIter = entrySet.iterator();
		while(entIter.hasNext()){
			Entry<String, Integer> result =entIter.next();
			result.getKey();
			result.getValue();
		}

		System.out.println("점수합계 : " + totalScore);
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
	}
}
