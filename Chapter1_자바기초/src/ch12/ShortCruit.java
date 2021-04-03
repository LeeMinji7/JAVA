package ch12;

public class ShortCruit {
	
	public static void main(String[] args) {
			
		// 단락 회로 평가(short circuit evaluation)
		// : 모든 항이 실행되지 않아도 결과 나옴
				
		int num1 = 10;
		int i = 2;
				
		boolean value = ((num1=num1+10) < 10) && ((i=i+2) < 10);
		
		System.out.println(value);
		System.out.println(num1); // 더하기 연산 실행완료!!
		System.out.println(i); // 더하기 연산 실행x => 앞에 결과가 나오므로 연산 계산x : 단락 회로 평가
		
			
		value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
			
		}

}
