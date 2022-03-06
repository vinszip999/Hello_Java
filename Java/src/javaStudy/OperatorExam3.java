package javaStudy;

public class OperatorExam3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println((a-b)*c);
		
		// > : 비교 연산자 / &&, || : 논리 연산자
		System.out.println(a>5 && b>5); // false
		System.out.println(a>5 || b>5); // true
		
		System.out.println(++a - 5); // 전이 연산자
		System.out.println(a++ - 5); // 후이 연산자
		
		System.out.println(a);
		

	} // end of main

} // end of class
