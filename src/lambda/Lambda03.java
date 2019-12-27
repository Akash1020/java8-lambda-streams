package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import lambda.model.Course;

public class Lambda03 {

	public static void main(String[] args) {
		List<Course> course = mockListCourses();

		
		// USING STREAM AND COLLECTORS
		
		
		
		// 1. Example 01 -> OptionalDouble (using Optional)
		OptionalDouble average = course.stream()
			.filter(c -> c.getStudent() > 100)
			.mapToInt(Course::getStudent)
			.average();
		

		 System.out.println();
		 System.out.println();
		
		 
		 // 2. Example 02 - With collectors we can change the stream list, return types we want
		 List<Course> collectCourses = course.stream()
				 	.filter(c -> c.getStudent() >=100)
				 	.collect(Collectors.toList());
//		 
//		 course = course.stream()
//		 	.filter(c -> c.getStudent() >=100)
//		 	.collect(Collectors.toList());
//		 

		 System.out.println();
		 System.out.println();
		 

		
	}

	
	// MOCK COURSES
	public static List<Course> mockListCourses() {
		List<Course> c = new ArrayList<>();
		c.add(new Course("Python", 45));
		c.add(new Course("JavaScript", 150));
		c.add(new Course("Java 8", 113));
		c.add(new Course("C", 55));
		return c;
	}

}
