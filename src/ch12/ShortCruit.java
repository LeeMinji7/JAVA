package ch12;

public class ShortCruit {
	
	public static void main(String[] args) {
			
		// �ܶ� ȸ�� ��(short circuit evaluation)
		// : ��� ���� ������� �ʾƵ� ��� ����
				
		int num1 = 10;
		int i = 2;
				
		boolean value = ((num1=num1+10) < 10) && ((i=i+2) < 10);
		
		System.out.println(value);
		System.out.println(num1); // ���ϱ� ���� ����Ϸ�!!
		System.out.println(i); // ���ϱ� ���� ����x => �տ� ����� �����Ƿ� ���� ���x : �ܶ� ȸ�� ��
		
			
		value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
			
		}

}
