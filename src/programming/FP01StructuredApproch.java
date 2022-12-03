package programming;

import java.util.List;

public class FP01StructuredApproch {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(14,12,11,7,6,88,92,15,4);
		printAllNumbersInListStructured (numbers); // Arrays.asList java 8, List.of(java 9)
		System.out.println("***********************************************");
		printAllEvenNumbersInListStructured (numbers);
	}
	
	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers ?
		for(int number: numbers) {
			System.out.println(number);
		}
	}	
	private static void printAllEvenNumbersInListStructured(List<Integer> numbers) {
		for(int number: numbers) {
			if(number %2 == 0) {
				System.out.println(number);
			}
		}
	}

}


