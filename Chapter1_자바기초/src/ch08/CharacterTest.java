package ch08;

public class CharacterTest {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char han = '한'; // 한글
		char ch = '\uD55C'; // 유니코드 코드값
//		char ch = 1234567; // 오류: 2바이트 넘는 숫자
//		char ch = -66; // 오류: char는 음수값x
		// char는 2바이트, 내부적으로 해당되는 코드값의 정수값
		
		System.out.println(han);
		System.out.println(ch);
	}

}
