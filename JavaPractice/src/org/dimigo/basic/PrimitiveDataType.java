package org.dimigo.basic;

/**
 * << 첫번째 수행평과 과제 >>
 * 내용 : 아이유 프로필 출력하기
 * 작성일자 : 2015.3.13
 * @author JeongUkJae
 * @version 1.0
*/

public class PrimitiveDataType {
	public static void main(String[] args) {
		String name = "아이유";
		boolean isMale = false;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';

		System.out.printf("<< %s 프로필 >> \n\n", name);
		System.out.printf("이름 : %s\n", name);
		System.out.printf("성별 : %s\n", getGender(isMale));
		System.out.printf("나이 : %d\n", age);
		System.out.printf("키 : %.1f\n", height);
		System.out.printf("몸무게 :  %.1f\n", weight);
		System.out.printf("혈핵형 : %c 형\n", bloodType);
	}

	private static String getGender(boolean gender) {
		return (gender) ? "남자" : "여자";
	}
}