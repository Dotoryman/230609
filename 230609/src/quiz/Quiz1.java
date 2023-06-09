package quiz;

public class Quiz1 {
	public static void main(String[] args) {
		// 511p 7번문제
		String str = "모든 자바프로그램은 자바 언어로 개바될 수 있다.";
		int index = str.indexOf("자바");
		
		if(index == -1) {
			System.out.println("문자열에 자바 가 없습니다");
		} else {
			System.out.println("문자열에서 자바 를 찾았습니다");
			str = "모든 JAVA프로그램은 JAVA 언어로 개바될 수 있다.";
			System.out.println("-->" + str);
		}
	}
}
