package ex05;

import lombok.extern.log4j.Log4j;


@Log4j
public class CompareMethodExample {

	
	public static void main(String[] args) {
		// Generic Class Pair<K, V>에서 2개의 객체 생성
		// Generic Class를 사용할 때
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "사과");
		
		//-------------------//
		// The 1st usage of generic method
		//-------------------//
		
		// Generic Method Invocation
		boolean result1 = 
			Util1.<Integer, String>compare(p1, p2);
		
		//-------------------//
		
		//비교결과를 가지고 로직처리
		if(result1) {
			log.info("논리적으로 동등한 객체입니다.");
		} else {
			log.info("논리적으로 동등하지 않은 객체입니다.");
		} // if-else		
		
		//-------------------//
		// The 2nd usage of generic method
		//-------------------//
		
		// Generic Class를 사용할 때 => 구체타입 지정
		Pair<String, String> p3 =
				new Pair<>("user1", "홍길동");
		Pair<String, String> p4 =
				new Pair<>("user2", "홍길동");
		
		boolean result2 = Util1.compare(p3, p4);
		
		if(result2) {
			log.info("논리적으로 동등한 객체입니다.");
		} else {
			log.info("논리적으로 동등하지 않은 객체입니다.");
		} // if-else
	} // main
	
} // end class