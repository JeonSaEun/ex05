package ex05;

import java.util.Arrays;

import lombok.extern.log4j.Log4j;


@Log4j
public class WildCardExample {

	
	public static void registerCourse(Course<?> course) {
		log.info(course.getName() +
				" 수강생: " + 
				Arrays.toString(course.getStudents()));		
	} // registerCourse
	
	//--------------------------//
	
	public static void registerCourseStudent(
			Course<? extends Student> course) {
		log.info(course.getName() +
				" 수강생: " +
				Arrays.toString(course.getStudents()));
	} // registerCourseStudent
	
	//--------------------------//
	
	public static void registerCourseWorker(
			Course<? super Worker> course) {
		log.info(course.getName() +
				" 수강생: " +
				Arrays.toString(course.getStudents()));
	} // registerCourseWorker
	
	//--------------------------//
	
	public static void main(String[] args) {
		
		Course<Person> personCourse = 
			new Course<>("일반인과정", 5);
		
	//--1. ------------------------//
		
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
	//--2. ------------------------//
		
		Course<Worker> workerCourse =
			new Course<>("직장인과정", 5);
		
		workerCourse.add(new Worker("직장인"));
		
	//--3. ------------------------//
		
		Course<Student> studentCourse =
			new Course<>("학생과정", 5);
		
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
	//--4. ------------------------//
		
		Course<HighStudent> highStudentCourse =
			new Course<>("고등학생과정", 5);
		
		highStudentCourse.add(new HighStudent("고등학생"));
		
	//--5. ------------------------//
		
		// 일반인과정등록
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		
		log.info("\n");
		
		//----------------------------------//
		//registerCourseStudent(personCourse);	(x)
		//registerCourseStudent(workerCourse);	(x)
		//----------------------------------//		
		// 학생과정등록
		registerCourseStudent(studentCourse);
		// 고등학생과정등록
		registerCourseStudent(highStudentCourse);
		
		log.info("\n");
		
		// 직장인과정등록
		registerCourseWorker(personCourse);
		// 직장인과정등록
		registerCourseWorker(workerCourse);
		//----------------------------------//
		//registerCourseWorker(studentCourse);		(x)
		//registerCourseWorker(highStudentCourse);	(x)
		//----------------------------------//
	} // main
	
} // end class