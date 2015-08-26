/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 25.
 * </pre>
 * 
 * 
 * @author jeongukjae
 * @version : 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		IPhone s1 = new IPhone("iPhone 6", "애플", 700000);
		Galaxy s2 = new Galaxy("Galaxy S6", "삼성", 650000);

		
		System.out.println(s1);
		s1.turnOn();
		s1.pay();
		s1.useSpecialFunciton();
		s1.turnOff();

		System.out.println();
		
		System.out.println(s2);
		s2.turnOn();
		s2.pay();
		s2.useSpecialFunciton();
		s2.turnOff();
	}
}
