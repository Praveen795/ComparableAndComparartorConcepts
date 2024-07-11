package LearnComparable;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class LearnComparable {
	
	public static void main(String[] args) {
		
		List<Animal> animals=new ArrayList<>();
		animals.add(new Animal(5, "zibra", 30));
		animals.add(new Animal(2, "elephant", 50));
		animals.add(new Animal(9, "monky", 8));
		animals.add(new Animal(2, "dog", 10));
		
		Collections.sort(animals);
		System.out.println(animals);
		
		
		
		
		
		
	}
	


}
