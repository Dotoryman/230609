package com.yedam;

import java.util.Scanner;

public class SystemEx {
	public static void main(String[] args) {
		
		long stime = System.currentTimeMillis();
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("1. 출력  2. 종료");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("print");
			} else if (menu == 2) {
//				System.exit(0);
				break;
			}
		}
		System.out.println("프로그램 종료");
		long etime = System.currentTimeMillis();
		System.out.printf("실행시간 : %d\n", (etime - stime));
	}
}
