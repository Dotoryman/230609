package com.yedam.list;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<String> stacks = new Stack<>();
		stacks.push("사과");
		stacks.push("오렌지");
		stacks.push("레몬");
		
		System.out.println(stacks.peek());//데이터를 하나씩 빼오고 남겨둠
		
		while(!stacks.isEmpty()) {
			System.out.println(stacks.pop());
		}
//		System.out.println(stacks.pop());//데이터를 하나씩 빼오고 제거
//		System.out.println(stacks.pop());
//		System.out.println(stacks.pop());
	}
}
