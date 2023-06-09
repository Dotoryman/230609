package com.yedam.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.yedam.Member;

public class MapEx { //키와 값을 동시에 저장함
	public static void main(String[] args) {
		//키, 값
		Map<String, Integer> map;
		
		map = new HashMap<>();
		
		map.put("워싱턴", 90);
		map.put("루즈벨트", 88);
		map.put("빅터", 85);
		map.put("워싱턴", 95); //키값인 워싱턴은 하나만 가질수있다
//		map.remove("워싱턴")
		
		// 조회.
		Integer result = map.get("워싱턴");
		System.out.println(result);
		
		Set<String> keys = map.keySet(); // 키값을 담은 set 반환
		// keySet 확인
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			Integer val = map.get(key);
			System.out.printf("키값은 %s 입니다, 값은 %d 입니다\n", key, val);
		}
		
		//key : Member, val : Integer
		Map<Member, Integer> members = new HashMap<>();
//		Member member = new Member ("user1","1111");
		members.put(new Member("user1","1111"), 100);
		members.put(new Member("user2","2222"), 120);
		members.put(new Member("user1","1112"), 140); //hashcode, equals;
		System.out.println(members.size());
		
		Integer point = members.get(new Member("user1","1111"));
		System.out.println(point);

	}
}
