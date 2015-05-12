/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Score
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 12.
 * </pre>
 * 
 * 
 * @author JeongUkJae
 * @version : 1.0
 */
public class Score {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int kor, math, eng;
		System.out.print("국어 점수 입력 => ");
		kor = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		math = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		eng = scanner.nextInt();

		System.out.println();
		int sum;
		StringBuilder sb = new StringBuilder("<< 점수 출력 >>\n")
				.append("국어 점수 : ")
				.append(kor)
				.append("점\n")
				.append("수학 점수 : ")
				.append(math)
				.append( "점\n")
				.append("영어 점수 : ")
				.append(eng)
				.append("점\n")
				.append("총점 : ")
				.append(sum = kor + math + eng)
				.append("점\n")
				.append("평균 : ")
				.append(sum / 3)
				.append("점\n");
		System.out.println(sb.toString());
	}
}
