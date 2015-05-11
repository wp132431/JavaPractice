/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 11.
 * </pre>
 * 
 * 
 * @author JeongUkJae
 * @version : 1.0
 */
public class Question {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] main) {
		System.out.println("가장 좋아하는 가수는?");
		String answer = scanner.nextLine();
		answer("빅뱅".equals(answer));

		System.out.println("가장 좋아하는 배우는?");
		answer = scanner.nextLine();
		answer("조인성".equals(answer));
		
		System.out.println("가장 좋아하는 과목은?");
		answer = scanner.nextLine();
		answer("자바".equals(answer));
	}
	
	private static void answer(boolean isCorrect) {
		if(isCorrect) {
			System.out.println("정답입니다!! ^^ ");
		} else {
			System.out.println("틀렸습니다!! ㅜㅜ ");
		}
		System.out.println();
	}
}
