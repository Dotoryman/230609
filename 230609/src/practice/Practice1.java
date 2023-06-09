package practice;

public class Practice1 {
	public static void main(String[] args) {
		//487p 예제
		String ssn = "991212-4666666";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남성입니다");
			break;
		case '2':
		case '4':
			System.out.println("여성입니다");
			break;
		}
	}
}
