package com.yedam;

public class StringEx {
	public static void main(String[] args) {

		// 1번 예제 : 파일명(sample) 과 확장자명(jpg) 반환해보기
		String str = "c:/temp/images/sample.jpg";
		String fileName = str.substring(15, 21);
		System.out.println(fileName);

		String extName = str.substring(22, 25);
		System.out.println(extName);

		// 2번 예제 : 각 주민번호를 확인해서 남/여/null 구분하기, 2023년 기준으로
		String[] ssn = { "950102-1234567", "960405 2345678", "9703041234567", "0501013456789", "0604014545678",
				"250903-3234567" };
//		내답변
//		for(int i = 0 ; i < ssn.length; i++) {
//			if(i <= 1) {
//				char sex = ssn[i].charAt(7);
//				switch (sex) {
//				case '1':
//					System.out.println("남성입니다");
//					break;
//				case '2':
//					System.out.println("여성입니다");
//					break;
//				}	
//			} else if(i <= 4){
//				char sex = ssn[i].charAt(6);
//				switch (sex) {
//				case '1':
//				case '3':
//					System.out.println("남성입니다");
//					break;
//				case '2':
//				case '4':
//					System.out.println("여성입니다");
//					break;
//				}
//			} else {
//				System.out.println("잘못된 주민번호입니다");				
//			}
//		}

	}
	
	public static String check(String str) {
		String gender = str;
		gender = gender.replace("-", "").replace(" ", "");
		char c = gender.charAt(6);
		if (c == '1') {
			return "남";
		} else if (c == '3') {
			return "남";
		} else if (c == '2') {
			return "여";
		} else if (c == '4') {
			return "여";
		}
		return null;
	}
}
