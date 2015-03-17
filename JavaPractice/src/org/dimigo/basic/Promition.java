package org.dimigo.basic;

public class Promition {
	public static void main(String[] args) {
		int salary = 1700000;
		int clerk = 3;
		int shop = 1500;
		long annualSalary = (long)salary * (long)12;
		
		System.out.println("<< 디미베네 인건비 >>");
		System.out.println("월평균 인건비 : " + String.format("%d", salary));
		System.out.println("점원 수 : " + String.format("%d", clerk));
		System.out.println("점포 수 : " + String.format("%d", shop));
		System.out.println("연평균 인건비 : " + annualSalary);
	}
}
