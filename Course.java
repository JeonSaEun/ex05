package ex05;


public class Course<T> {
	private String name;
	private T[] students;
	
	
	public Course(String name, int capacity) {
		this.name = name;
		
		// Generic Type을 원소로 가지는 배열을 만들때에는
		// 바로 new T[] 문법으로는 배열을 만들 수 없다.
		// 때문에, 우선 단군할아버지 타입을 원소로 가지는 배열을
		// 먼저 만들고, 그 후에 강제형변환을 통해, Generic Type
		// T[] 배열로 만들어야 합니다.
		students = (T[]) (new Object[capacity]);
	} // constructor
	
	public String getName() {
		return name;
	} // getName
	
	public T[] getStudents() {
		return students;
	} // getStudents
	
	public void add(T newStudent) {
		for(int i=0; i<students.length; i++) {
		
			if(students[i] == null) {
				students[i] = newStudent;
				
				break;
			} // if
		} // for
		
	} // add
	
} // end class