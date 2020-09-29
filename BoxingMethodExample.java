package ex05;


public class BoxingMethodExample {

	
	public static void main(String[] args) {
		// 제네릭 메소드 호출방법 1
		Box<Short> box1 = Util.<Short>boxing((short)2);
		short intValue = box1.get();
		
		//---------------------//
		
		// 제네릭 메소드 호출방법 2
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
	} // main
	
} // end class