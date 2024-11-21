package Demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	//@Test
	public void regular(){
		ArrayList<String> names = new ArrayList<String>();

		names.add("Sravya");
		names.add("Reenika");
		names.add("Eeya");
		
		int count=0;
		for(int i=0; i<names.size();i++) {
			String oneName = names.get(i);
			if(oneName.startsWith("S")) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}
	
	
//	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sally");
		names.add("Sravya");
		names.add("Reenika");
		names.add("Eeya");
		
		Long c =names.stream().filter(s->s.startsWith("S")).count();
		System.out.println(c);
		
		
		long d =Stream.of("Savya","Sangeet","Sreenika","Sreeya","Rama").filter(s-> {
			s.startsWith("S");
//			return false;
			return true;
		}).count();
		
		System.out.println(d);
		
		//print all names >4 letters in ArrayList
		names.stream().filter(v->v.length()>4).limit(1).forEach(v->System.out.println(v));;
		
	}
	
	
		
//		@Test
		public void streamMap() {
			Stream.of("Savya","Sangeet","Sreenika","Sreeya","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));;
		
		
			
			List<String> arrl =Arrays.asList("Carrot","Cabbage","Tomato","Bell Pepper","Spinach");
			arrl.stream().filter(s->s.startsWith("Ca")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		
		
			List<String> arrli = Arrays.asList("fig","pear","plum","banana","apple","orange");
			arrli.stream();
			
			Stream<String> newStream=Stream.concat(arrl.stream(), arrli.stream());
//			newStream.sorted().forEach(s->System.out.println(s));
			
			
			boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Ca"));
			System.out.println(flag);
//			Assert.assertTrue(flag);
			
		}
	
		
		@Test
		public void streamCollect() {
			List<String> ls = Stream.of("trucks","jobs","bushes","dishes").filter(s->s.contains("s")).map(s->s.toUpperCase()).collect(Collectors.toList());
			System.out.println(ls.get(0));
		
		
			
			

			//sort the array
			List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
			
			//print unique numbers
			values.stream().distinct().forEach(s->System.out.println(s));
			
			System.out.println("***************");
			List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(li.get(2));
		
		}

		
}
