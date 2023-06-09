package com.yedam;

import java.util.Scanner;

public class TypingSpeedEx {
	// 문장 출력 > 입력 : This > 제거된후 출력 > 다시입력 : method 제거 -> ... 문장 모두 제거
	// 완료 : 완료메세지 : 실행했던 시간 80초 -> 1분 20초
	// 반복 1.문장출력 2.입력 3.입력값==문장일때 제거 4.완료체크->반복문 나오기
	public static void main(String[] args) {

		
		long start = System.currentTimeMillis();
		String origin = "This method never returns normally.";
		boolean run = true;

		Scanner scn = new Scanner(System.in);
		String[] origAry = origin.split(" ");

		long stime = System.currentTimeMillis();
		while (run) {
			if (checkAry(origAry)) {
				break;
			}
			
			System.out.println(arrayToString(origAry));
			System.out.println("입력 > ");
			String userInput = scn.nextLine();
			boolean isLeft = true;
			for (int i = 0; i < origAry.length; i++) {
			if(origAry[i] != null && origAry[i].equals(userInput)) {
				System.out.println(origAry[i]);
				isLeft = false;
			if (origAry[i].equals(userInput)) {
				origAry[i] = null;
				break;
			}
			} else if (type == "method") {
				System.out.println("never returns normally.");
			} else if (type == "never") {
				System.out.println("returns normally.");
			} else if (type == "returns") {
				System.out.println("normally.");
			} else if (type == "normally.") {
				System.out.println("Clear!");
				break;
			}
		}
		}
		System.out.println("프로그램 종료");
		long end = System.currentTimeMillis();
		System.out.printf("완료시간 : %d\n", (end - start));

	}
	
	private static char[] arrayToString(String[] origAry) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static boolean checkAry(String[] ary) {
		boolean isLeft = false;
		for (String word : ary) {
			
		}
	}

	public static String checkDuration(long start, long end) {
		long duration = (end - start) / 1000;
		long mm = duration / 60;
		long ss = duration % 60;
		return mm + "분" + ss +"초";
		
	}

}
