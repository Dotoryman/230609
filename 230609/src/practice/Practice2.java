package practice;

public class Practice2 {
	public static void main(String[] args) {
		// 492p 예제
		String subject = "지바 프로그래밍";
		
		int location = subject.indexOf("밍"); //없는값을 찾으면 -1 출력
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("항목에 자바가 있습니다");
		} else {
			System.out.println("항목에 자바가 없습니다");
		}
	}
}
