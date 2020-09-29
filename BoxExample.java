package ex05;


public class BoxExample {

	
	public static void main(String[] args) {
//		Box box = new Box();
//		
//		//-------------------------//
//		box.set("홍길동");
//		String name = (String) box.get();
//		
//		//-------------------------//
//		box.set(new Apple());
//		Apple apple = (Apple) box.get();
		
		//-- 제네릭 클래스를 사용할 때!!--//
		// 타입 파라미터에 String 지정
		// (이것이 구체적인 타입, "구체타입")
//		Box<String> box1 = new Box<String>();	// JDK5 ~ JDK7
		Box<String> box1 = new Box<>();			// <>연산자: 타입 추론
		// <>연산자: 타입추론 연산자를 사용할 수 없는 때(구체타입의 생략이
		// 불가능한 때) ==> "익명구현객체코딩, 익명자식객체코딩"시에는
		// 제네릭타입을 "사용할 때" --> RValue의 구체타입 생략 불가
		
		box1.set("hello");
		String str = box1.get();
		
		//-- 제네릭 클래스를 사용할 때!!--//
		// 타입 파라미터에 Integer 지정
		Box<Integer> box2 = new Box<Integer>();
		
		box2.set(6);
		int value = box2.get();
	} // main
	
} // end class
