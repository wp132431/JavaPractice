package org.dimigo.basic;

public class Condition {
	public static void main(String[] args){
		String car = "고속버스";
		int distance = 25;
		int fee = 0;
		
		System.out.println("고속도로 통행료 계산");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		
		if(distance > 0) {
			distance -= 10;
			
			if(car.equals("고속버스"))
				for(fee = 850;distance > 0;fee += 300, distance -= 10);
			
			else if(car.equals("경차"))
				for(fee = 300;distance > 0;fee += 200, distance -= 10);
			
			else if(car.equals("그 외"))
				for(fee = 600;distance > 0;fee += 200, distance -= 10);
		}
		
		System.out.println("통행료 : " + fee);
	}
}
