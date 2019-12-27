package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambda01 {

	public static void main(String[] args) {
		List<String> words = mockListWords();
		
		
		System.out.println("->>> NOT LAMBDA");
		System.out.println();
		// NOT LAMBDA, USING MODE DEFAULT
		// 1. print default with forEach with Consumer
		words.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		// 2. using comparator
		words.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		System.out.println();
		
		
		
		
		System.out.println("->>> USING LAMBDA");
		System.out.println();
		// USING LAMBDA
		// 1. print default with forEach
		words.forEach(w -> System.out.println(w));
		
		// 2. using comparator
		words.sort((w1, w2) -> Integer.compare(w1.length(), w2.length()));

		
		//NOT COMPILE, BECAUSE 'OBJECT' NOT IS INTERFACE FUNCTIONAL
		//Object o = s -> System.out.println(s);
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		System.out.println();
		
		
		
		
		System.out.println("->>> USING LAMBDA WITH METHOD REFERENCES");
		System.out.println();
		// USING LAMBDA
		// 1. print default with forEach with method references
		words.forEach(System.out::println);
		
		// 2. using comparator with method references
		words.sort(Comparator.comparing(String::length));
		
		
		
		
		
		//ANOTATIONS AND EXAMPLES
		// Give String and Return Integer
		Function<String, Integer> function = String::length;
		//Function<String, Integer> function2 = s -> s.length();
		
		// Create comparator
		Comparator<String> comparator = Comparator.comparing(function);
		
		//Add sort
		words.sort(comparator);
	}
	
	
	//MOCK WORDS
	public static List<String> mockListWords(){
		List<String> wordsMock = new ArrayList<>();
		wordsMock.add("alura online");
		wordsMock.add("editora casa do codigo");
		wordsMock.add("caelum");
		wordsMock.add("murillo");
		return wordsMock;
	}
	
}
