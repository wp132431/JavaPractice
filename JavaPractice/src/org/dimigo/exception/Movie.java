/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ Movie
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 22.
 * </pre>
 * 
 * 
 * @author jeongukjae
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limit;
	
	public Movie(String title, int limit) {
		this.title = title;
		this.limit = limit;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLimitAge() {
		return limit;
	}

}
