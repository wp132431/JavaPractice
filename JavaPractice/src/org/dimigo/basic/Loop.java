package org.dimigo.basic;

public class Loop {
	public static void main(String[] args) {
		for(int i = 0;i < 10;i++) {
			for(int j = 0;j < i;j++)
				System.out.print(j + 1);
			
			System.out.print("*");
			for(int j = i + 1;j < 10;j++)
				System.out.print(j + 1);
			System.out.print("\n");
		}
	}
}
