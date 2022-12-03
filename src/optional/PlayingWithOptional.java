package optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
	public static void main(String[] args) {
		
		List<String> fruits = List.of("Pomme", "Bananne", "Orange", "Mango");
		
		Predicate<? super String> predicate1 = fruit -> fruit.startsWith("B"); // fruit starts with B might or might not be exit
		
		Optional<String> optional = fruits.stream().filter(predicate1).findFirst();
		
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
		System.out.println(" ************************ ****************************** ");
		Predicate<? super String> predicate2 = fruit -> fruit.startsWith("C");
		Optional<String> optionalEmpty = fruits.stream().filter(predicate2).findFirst();
		
		System.out.println(optionalEmpty);
		System.out.println(optionalEmpty.isEmpty());
		System.out.println(optionalEmpty.isPresent());
		//System.out.println(optionalEmpty.get());
		
		System.out.println(" ************************ Create Optional ****************************** ");

		Optional<String> fruit = Optional.of("Orange");
		Optional<String> empty = Optional.empty();
		
		System.out.println(fruit);
		System.out.println(fruit.get());
		System.out.println(empty);
		System.out.println(empty.isPresent());
		
	}
}
