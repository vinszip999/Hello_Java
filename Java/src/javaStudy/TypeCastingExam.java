package javaStudy;

public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 50000;
		// 작은 것 -> 큰 것 담을 수 있음 *형변환이 일어남*
		long y = x; // 묵시적형변환
		
		long x2 = 5;
		int y2 = (int)x2; // 강제형변환
		

	} // end of main

} // end of class
