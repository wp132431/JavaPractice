/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest2
 * 
 * 개요 : Car 클래스로부터 3개의 Car 객체를 생성하여 아래와 같이 출력해보기 + 생성자
 * 작성일 : 2015. 4. 13.
 * </pre>
 * 
 * 
 * @author JeongUkJae
 * @version : 1.0
 */
public class CarTest3 {
	public static void main(String[] args) {
		Car3 car1 = new Car3("현대자동차", "제네시스", "검정색", 246, 50000000);
		Car3 car2 = new Car3("기아자동차", "K7", "흰색", 246);
		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");
		
		System.out.println("<< 자동차 목록 >>");
		print(car1);
		print(car2);
		print(car3);
	}
	
	private static void print(Car3 car) {
		System.out.println("제조사 명 : " + car.getCompany());
		System.out.println("모델 명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km/h");
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		System.out.println();
	}
}
