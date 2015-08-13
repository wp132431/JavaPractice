/**
 * 
 */
package org.dimigo.inheritance;


/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Triangle
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * 
 * @author jeongukjae
 * @version : 1.0
 */
public class Triangle extends Figure {
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		this(0,0,width, height);
	}
	
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	@Override
	protected double calcArea() {
		return width * height / 2.0;
	}

	@Override
	protected void printCenter() {
		System.out.printf("삼각형 중심좌표 : (%d, %d)\n", super.centerX, super.centerY);
	}
}
