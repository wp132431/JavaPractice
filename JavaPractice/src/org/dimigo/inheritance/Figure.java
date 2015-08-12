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
	private int centerX;
	private int centerY;
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 0.0;
	}
}
