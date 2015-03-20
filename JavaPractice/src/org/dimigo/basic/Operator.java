package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int sTop = 9;
		int sBottom = 10;
		double sHeight = 5.8;
		
		int pBottom = 9;
		double pHeight = 5.4;
		
		double sArea = ((sTop + sBottom) * sHeight / 2);
		double pArea = (pBottom * pHeight);
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + sArea);
		System.out.println("평행사변형 넓이 : " + pArea);
		
		if(sArea > pArea)
			System.out.println("\n\n사다리꼴이 평행사변형보다 " + 
				(sArea - pArea) + 
				" 더 큽니다.");
		else
			System.out.println("\n\n평행사변형이 사각형보다 " + 
				(pArea - sArea) + 
				" 더 큽니다.");
		
	}
}
