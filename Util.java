package ex05;


public class Util {

	
	// Generic Method: return type or parameter type이
	// 타입파라미터인 경우
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();		
		box.set(t);
		
		return box;
	} // boxing
} // end class
