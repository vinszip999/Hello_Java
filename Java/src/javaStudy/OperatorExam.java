package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		int i1 = -5; // - : 부호 연산자 / 5 : 피연산자
		int i2 = +i1; // *적용이 안됨* +(-5) = -5
		int i3 = -i1; // -(-5) = +5
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // i3 = i3+1;
		System.out.println(i4);
		System.out.println(i3); // 값이 6으로 바껴있음
		int i5 = i3++; // i3 = i3 + 1;
		System.out.println(i5);
		System.out.println(i3); /// 값이 7로 바껴있음
		
		int i = 5;
		int j = 2;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/(double)j); // 정수 연산 = 정수
		System.out.println(i%j);
		

	} // end of main

} // end of class
