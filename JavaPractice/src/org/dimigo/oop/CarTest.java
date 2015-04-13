/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 * 
 * 개요 : Car 클래스로부터 3개의 Car 객체를 생성하여 아래와 같이 출력해보기
 * 작성일 : 2015. 4. 13.
 * </pre>
 * 
 * 
 * @author JeongUkJae
 * @version : 1.0
 */
public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.setColor("검정색");
		car1.setModel("제네시스");
		car1.setCompany("현대자동차");
		car1.setMaxSpeed(225);
		car1.setPrice(50000000);
		
		car2.setColor("흰색");
		car2.setModel("K7");
		car2.setCompany("기아자동차");
		car2.setMaxSpeed(246);
		car2.setPrice(40000000);
		
		car3.setColor("회색");
		car3.setModel("SM7");
		car3.setCompany("삼성자동차");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);
		
		System.out.println("<< 자동차 목록 >>");
		print(car1);
		print(car2);
		print(car3);
	}
	
	private static void print(Car car) {
		System.out.println("제조사 명 : " + car.getCompany());
		System.out.println("모델 명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km/h");
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		System.out.println();
	}

}
