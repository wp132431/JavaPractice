/**
 * 
 */
package org.dimigo.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ HashMapTest
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 24.
 * </pre>
 * 
 * 
 * @author jeongukjae
 * @version : 1.0
 */
public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("kor", 100);
		map.put("mat", 92);
		map.put("eng", 95);
		
		printMap(map);
		
		map.put("eng", 97);
		
		printMap(map);
	}
	
	public static void printMap(Map<String, Integer> map) {
		for(String key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}
		System.out.println("-----------------------------\n");
	}
}
