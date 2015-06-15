/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBank
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 15.
 * </pre>
 * 
 * 
 * @author JeongUkJae
 * @version : 1.0
 */
public class PiggyBank {
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount) {
		if(amount < 0)
			return;
		System.out.println(member.getMemberName() + " " + amount + "원 넣음\n");
		balance += amount;
	}
	
	public static void printBalance() {
		System.out.println("돼지저금통 총 금액 : " + balance + "원\n");
	}
}
