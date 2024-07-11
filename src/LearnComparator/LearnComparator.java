package LearnComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnComparator {
	
	public static void main(String[] args) {
		
		List<Student> students=new ArrayList<>();
		students.add(new Student(2, "navin", 25));
		students.add(new Student(2, "parul", 21));
		students.add(new Student(2, "jog", 15));
		students.add(new Student(2, "shrda", 22));
		
		Comparator<Student> stdComparator=(i,j)->{
			if(i.id==j.id) {
				return i.age-j.age;
			}
			
			return i.id-j.id;
		};
	
		
		Collections.sort(students, stdComparator);
		System.out.println(students);
		
	}
	
	

}
