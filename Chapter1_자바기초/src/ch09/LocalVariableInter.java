package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {

		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "hello";
//		str = 3; // 이미 데이터 형이 정해져 있을 때, 변경x
				

	}

}
