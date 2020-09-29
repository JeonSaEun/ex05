package ex05;

import lombok.NoArgsConstructor;

@NoArgsConstructor
// 제네릭 타입 : 2가지(제네릭 클래스, 제네릭 인터페이스)
public class Box<T> {	// Generic type's class

//	private Object object;
//	
//	public Object get() {
//		return object;
//	} // get
//	
//	public void set(Object object) {
//		this.object = object;
//	} // set
	
	private T t;
	
	public T get() {
		return t;
	} // get
	
	public void set(T t) {
		this.t = t;
	} // set
} // end class
