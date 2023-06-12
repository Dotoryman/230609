package com.yedam.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Empp {
	int empNo;
	String empName;
	int salary;

	Empp(int empNo, String empName, int salary) {
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Empp> employees = new ArrayList<>();

		System.out.println("ex ) 100 트레비스 1000");

		while (true) {
			String input = scn.nextLine();
			String[] inputs = input.split(" ");
			if (inputs[0].equals("quit")) {
				System.out.println("종료합니다");
				break;
			}
			if (inputs.length != 3) {
				System.out.println("값을 정확하게 입력해 주세요.");
				continue;
			}
			employees.add(new Empp(Integer.parseInt(inputs[0]), inputs[1], Integer.parseInt(inputs[2])));

		}
		for(Empp emp : employees) {
			System.out.printf("사번 : %d , 이름 : %s , 급여 : %d\n", emp.empNo, emp.empName, emp.salary);
		}
	}
}
