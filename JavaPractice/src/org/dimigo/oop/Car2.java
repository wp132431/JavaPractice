/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car2
 * 
 * 개요 : Car Test 2 에서 필요한 객체 제공 + 생성자
 * 작성일 : 2015. 4. 13.
 * </pre>
 * 
 * 
 * @author JeongUkJae
 * @version : 1.0
 */
public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2() {
		
	}
	
	public Car2(String Company, String Model, String Color, int MaxSpeed, int Price) {
		company = Company;
		model = Model;
		color = Color;
		maxSpeed = MaxSpeed;
		price = Price;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
}
