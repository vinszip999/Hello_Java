package javaStudy;

public class OperatorExam4 {

	public static void main(String[] args) {
		int i = 10; // *단순 대입 연산자*
		int j = 10; // *단순 대입 연산자*
		
		System.out.println(i == j); // 같습니까?
		System.out.println(i != j); // 다릅니까?
		System.out.println(i < j); // i가 j보다 작습니까?
		System.out.println(i <= j); // i가 j보다 작거나 같습니까?
		System.out.println(i > j); // i가 j보다 큽니까?
		System.out.println(i >= j); // i가 j보다 크거나 같습니까?
		
		i += 10; // i = i + 10; *복합 대입 연산자**
		
		System.out.println(i);
		
		System.out.println(i-=5);
		System.out.println(i);
		

	} // end of main

} // end of class
