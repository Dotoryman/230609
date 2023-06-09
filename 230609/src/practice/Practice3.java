package practice;

public class Practice3 {
	public static void main(String[] args) {
		// 495p 예제
		String ssn = "889988-1234567";
		
		String frontNum = ssn.substring(0, 6);
		System.out.println(frontNum);
		
		String backNum = ssn.substring(7);
		System.out.println(backNum);
	}
}
