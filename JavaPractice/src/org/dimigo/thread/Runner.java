/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ Runner
 * 
 * 개요 : 
 * 작성일 : 2015. 11. 4.
 * </pre>
 * 
 * 
 * @author jeongukjae
 * @version : 1.0
 */
public class Runner extends Thread {
	private String name;
	public Runner() {
		
	}
	public Runner(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(name + " 출발");
		for(int  i = 0;i <= 10;i++) {
			System.out.println(name + " " + (100 - i * 10) + " 미터");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name + " 골인");
	}
}
