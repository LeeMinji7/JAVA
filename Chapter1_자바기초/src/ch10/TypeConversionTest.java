package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

//		byte bNum = 125;
//		int iNum = bNum;
		
	/*	int iNum = 255;
		byte bNum = (byte)iNum;
		
		System.out.println(bNum); // ctrl+space = 자동완성 // -1: 범위넘어서서 이상한 값 도출
		
		double dNum = 3.14;
		int inum = (int)dNum;
		
		System.out.println(inum);
		*/
		
		double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum; //1+0 = 1
		int iNum2 = (int)(dNum + fNum); // (int)2.1 = 2
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
	}

}
