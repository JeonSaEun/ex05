package ex05;

import lombok.extern.log4j.Log4j;


@Log4j
public class BoundedTypeParameterExample {

	
	public static void main(String[] args) {
//		String str = Util2.compare("a", "b"); (x)
		
		int result1 = Util2.<Number>compare(10, 20);
		log.info(result1);
		
		int result2 = Util2.<Number>compare(4.5, 3);
		log.info(result2);
	} // main
	
} // end class