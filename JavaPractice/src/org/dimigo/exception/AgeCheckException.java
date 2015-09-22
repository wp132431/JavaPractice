/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ AgeCheckException
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 22.
 * </pre>
 * 
 * 
 * @author jeongukjae
 * @version : 1.0
 */
public class AgeCheckException extends Exception {
	public AgeCheckException() {
		super();
	}
	
	public AgeCheckException(Movie movie) {
		super(movie.getTitle() + "은 " + movie.getLimitAge() + " 이상 관람가입니다.");
	}

}
