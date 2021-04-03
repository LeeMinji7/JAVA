package ch06;

public class VariableTest {

	public static void main(String[] args) {

		byte bnum = -128; // -128~127
//		int num = 12345678900; // 오류: 너무 큼
		long lNum = 12345678900L;
//		long lNum = 12345678900; // 가능: 작은공간에서 큰공간으로 바뀌는 건 상관없음

		System.out.println(bnum);
		System.out.println(lNum);

	}

}
