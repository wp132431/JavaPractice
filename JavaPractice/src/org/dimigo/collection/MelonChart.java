/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonChart
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 23.
 * </pre>
 * 
 * 
 * @author jeongukjae
 * @version : 1.0
 */
public class MelonChart {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		System.out.println("-- << 멜론 차트 >> --");
		list.add(new Music("바람이나 좀 쐬", "개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "iKon"));
		printList(list);
		System.out.println();
		
		System.out.println("-- << 2위 곡 추가 >> --");
		list.add(1, new Music("레옹", "이유갓지"));
		printList(list);
		System.out.println();
		
		System.out.println("-- << 3위 곡 변경 >> --");
		list.set(2, new Music("맙소사", "황태지"));
		printList(list);
		System.out.println();
		
		System.out.println("-- << 4위 곡 삭제 >> --");
		list.remove(3);
		printList(list);
		System.out.println();
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		list.clear();
		printList(list);
	}
	
	public static void printList(List<Music> list) {
		int cnt = 0;
		for(Music val : list) {
			System.out.println(++cnt + ". " + val);
		}
	}
}