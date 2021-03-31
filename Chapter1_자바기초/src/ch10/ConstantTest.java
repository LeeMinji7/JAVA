package ch10;

public class ConstantTest {

	public static void main(String[] args) {

		final int MAX_NUM = 100;
		final int MIN_NUM; // 상수 변수명은 모두 대문자!!
		
		MIN_NUM = 0;
//		MAX_NUM = 20; // 상수는 값 변경x
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
