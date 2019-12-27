package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import lambda.model.Course;

public class Lambda02 {

	public static void main(String[] args) {
		List<Course> course = mockListCourses();

		
		// USING STREAM (Stream return Stream)
		
		// Filter -> Is predicate (operators). Compare INT's
		// Map -> Returns a changed list, returning an integer or other types
		
		
		
		// 1. Example 01
		course.stream()
			.filter(c -> c.getStudent() >= 100)
			.map(Course::getStudent)
			.forEach(System.out::println);
		
		
		
		// 2. Example 02 (IntStream has its own methods for int)
		IntStream intStream = course.stream()
			.filter(c -> c.getStudent() >= 100)
			.mapToInt(Course::getStudent);
		
		System.out.println();
		System.out.println();
		intStream.forEach(System.out::println);
		
		
		
		// 3. Example 03. Using SUM
		int sum = course.stream()
			.filter(c -> c.getStudent() >= 100)
			.mapToInt(Course::getStudent)
			.sum();
		
		System.out.println();
		System.out.println("SUM Example03: "+sum);
		
		
		// 4. Example 04
		System.out.println();
		course.stream()
			.filter(c -> c.getStudent() > 50)
			.forEach(c -> System.out.println(c.getName()));
		
		
	}

	
	// MOCK WORDS
	public static List<Course> mockListCourses() {
		List<Course> c = new ArrayList<>();
		c.add(new Course("Python", 45));
		c.add(new Course("JavaScript", 150));
		c.add(new Course("Java 8", 113));
		c.add(new Course("C", 55));
		return c;
	}

}
