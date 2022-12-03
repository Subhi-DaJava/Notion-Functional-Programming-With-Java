package programming;

import java.util.List;

public class FP02Exercices {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "AZURE", "Docker",
				"Kurbernetes");
		List<Integer> numbers = List.of(14, 12, 11, 7, 6, 88, 92, 15, 4, 3, 11, 19);

		// 1
		System.out.println("********************* Odd numbers with lambda expression ****************************");
		printOddNumbersInListFunctional(numbers);

		// 2
		System.out.println("********************** print all courses ***********************************");
		printAllCourses(courses);

		// 3
		System.out.println(
				"****************************************** Print the course containing Spring **********************");
		printCoursesContainingSpring(courses);

		// 4
		System.out.println(
				"****************** Print Courses Whoses Name has at least 4 letters ***************************");
		printCoursesNameHasAtLeast4Letters(courses);

		// 5
		System.out.println("********************** Print the cubes of odd numbers **********************************");
		printCubesOfOddNumbers(numbers);

		// 6
		System.out.println(
				"************************ Print the number of characters in each course name ************************************");
		printNumberOfEachCourse(courses);
	}

	private static void printAllCourses(List<String> courses) {
		courses.stream().forEach(System.out::println);
	}

	private static void printCoursesContainingSpring(List<String> courses) {
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
		System.out.println("*************");
		courses.stream().filter(course -> course.equalsIgnoreCase("azure")).forEach(System.out::println);
	}

	private static void printCoursesNameHasAtLeast4Letters(List<String> courses) {
		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}

	private static void printCubesOfOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).map(number -> number * number * number)
				.forEach(System.out::println);
	}

	private static void printNumberOfEachCourse(List<String> courses) {
	courses
	.stream()
	.map(course -> course.length()) // Mapping return number 
	.forEach(System.out::println);
	
	System.out.println("******************* course + length ********************");
	courses
	.stream()
	.map(course -> course + " has " + course.length() + " characters, includes the spaces.")
	.forEach(System.out::println);
	}
	
	

}
