import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

//import org.testng.annotations.Test;

public class names {
//	@Test
//	public void regular() {
//		 
//		ArrayList<String> names = new ArrayList<String>();
//		
//		names.add("Jerin");
//		names.add("Jerry");
//		names.add("Tasnim");
//		names.add("Joe");
//		names.add("Zara");
//		int count = 0;
//		
//		for(int i =0; i<names.size(); i++) {
//			String actual  = names.get(i);
//			if(actual.startsWith("J")) {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
	
	@Test
	public void modifyingforGit() {
		System.out.println("I have modified this for git demo purpose");
	}
	@Test
	public void streamFilter() {
		 
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Jerin");
		names.add("Jerry");
		names.add("Tasnim");
		names.add("Joe");
		names.add("Zara");
		
		
		Long c =names.stream().filter(s->s.startsWith("J")).count();
		System.out.println(c);
		
		Long d = Stream.of("Jerina", "Jerry", "Tasnim", "Joe", "Zara").filter(s->
		{
			s.startsWith("J");
			return true;
		
		}).count();
		System.out.println(d);
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
		List<String> name = Arrays.asList("Jerina", "Jerry", "Tasnim", "Joe", "Zara");
		name.stream().filter(s->s.startsWith("J")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}


}
