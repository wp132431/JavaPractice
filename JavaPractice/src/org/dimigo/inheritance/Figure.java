/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Figure
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * 
 * @author jeongukjae
 * @version : 1.0
 */
public class Figure {
	protected int centerX;
	protected int centerY;
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 0.0;
	}

	protected void printCenter() {
		System.out.printf("중심좌표 : (%d, %d)\n", centerX, centerY);
	}
	
	protected void moveCenter(int x, int y) {
		centerX = x;
		centerY = y;
	}
}
