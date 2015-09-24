/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonGenreChart
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 24.
 * </pre>
 * 
 * 
 * @author jeongukjae
 * @version : 1.0
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		
		System.out.println(" --- << 멜론 장르별 차트 >> --- ");
		List<Music> l = new ArrayList<>();
		l.add(new Music("내 첫사랑", "베리굿"));
		l.add(new Music("또 다시 사랑", "임창정"));
		l.add(new Music("부산에 가면", "박진영"));
		map.put("발라드", l);
		map.put("댄스", Arrays.asList(
				new Music("커피", "유재환, 김예림"),
				new Music("다 잘될꺼야", "쿨")
			));
		printMap(map);
		System.out.println();
		
		System.out.println(" --- << 발라드 3위 곡 변경 >> --- ");
		map.get("발라드").set(2, new Music("지우고 지워도", "차수경"));
		printMap(map);
		System.out.println();
		
		System.out.println(" --- << 발라드 1위 곡 삭제 >> --- ");
		map.get("발라드").remove(0);
		printMap(map);
		System.out.println();
		
		System.out.println(" --- << 전체 리스트 삭제 >> --- ");
		map.remove("발라드");
		map.remove("댄스");
		
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()) {
			System.out.println("[" + key + "]");
			printList(map.get(key));
		}
	}

	public static void printList(List<Music> list) {
		int cnt = 0;
		for(Music val : list) {
			System.out.println(++cnt + ". " + val);
		}
	}
}
