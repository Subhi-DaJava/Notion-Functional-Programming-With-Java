package programming;

import java.util.List;

public class FP02FunctionalApproachMapping {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(14,12,11,7,6,88,92,15,4,3,11,19);
		
		System.out.println("********************* Print All Numbers  *******************************");
		printAllNumbersInListFunctional(numbers); // Arrays.asList java 8, List.of(java 9)
		
		System.out.println("************************ Print Squares of all Even Numbers ***********************************");
		printSquaresOfEvenNumbersInListFunctional(numbers);
		
		System.out.println("********************* Even numbers with lambda expression ****************************");
		printEvenNumbersInListFunctional(numbers);
		
	}

	

	private static void print(int number) {
		System.out.println(number);
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// What to do ?
		// transform the sequences of the numbers
		numbers.stream().forEach(FP02FunctionalApproachMapping::print); // Method Reference
		System.out.println("******************** second approach for printing ***************************************");
		numbers.stream().forEach(System.out::println);
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers
		.stream()
		.filter(number -> number %2 == 0) // Lambda Expression
		.map(number -> number * number) // Mapping -x -> x * x => x=x²
		.forEach(System.out::println);
	}
	
	
	// number -> number %2 == 0
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		// What to do ? And What to check ?
		numbers
		.stream()
		.filter(number -> number %2 == 0) // Lambda Expression
		.forEach(System.out::println); // Method Reference
	}
	

}
