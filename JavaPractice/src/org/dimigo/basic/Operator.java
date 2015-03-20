package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int sTop = 9;
		int sBottom = 10;
		double sHeight = 5.8;
		
		int pBottom = 9;
		double pHeight = 5.4;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + ((sTop + sBottom) * sHeight / 2));
		System.out.println("평행사변형 넓이 : " + (pBottom * pHeight));
		
		System.out.println("\n\n사다리꼴이 평행사변형보다 " + 
				(((sTop + sBottom) * sHeight / 2) - (pBottom * pHeight)) + 
				" 더 큽니다.");
	}
}
