/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Rectangle
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * 
 * @author jeongukjae
 * @version : 1.0
 */
public class Rectangle extends Figure {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this(0, 0, width, height);
	}
	
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	@Override
	protected double calcArea() {
		return width * height;
	}
}
