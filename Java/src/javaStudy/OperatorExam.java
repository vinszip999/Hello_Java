package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		int i1 = -5; // - : ��ȣ ������ / 5 : �ǿ�����
		int i2 = +i1; // *������ �ȵ�* +(-5) = -5
		int i3 = -i1; // -(-5) = +5
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // i3 = i3+1;
		System.out.println(i4);
		System.out.println(i3); // ���� 6���� �ٲ�����
		int i5 = i3++; // i3 = i3 + 1;
		System.out.println(i5);
		System.out.println(i3); /// ���� 7�� �ٲ�����
		
		int i = 5;
		int j = 2;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/(double)j); // ���� ���� = ����
		System.out.println(i%j);
		

	} // end of main

} // end of class
