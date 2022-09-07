package generics.bounded;

import java.util.ArrayList;
import java.util.List;

public class GenericsLowerBoundAndWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> ol=new ArrayList<>();
		addNumber(ol);
		
		ol.forEach(o->System.out.println(o));
		
		List<Number> ln=new ArrayList<>();
		addNumber(ln);
		
		ln.forEach(o->System.out.println(o));
		
		
		List<Integer> li=new ArrayList<>();
		addNumber(li);
		
		li.forEach(o->System.out.println(o));
		
		
		//You can't because it accept the jut List<Object>
		//addNumber3(li);
		
		

	}
	
	
	public static void addNumber(List<? super Integer> list) {
		for (int i = 1; i <=10; i++) {
			list.add(i);
		}
	}

	
	public static void addNumber2(List<?> myList) {
		//myList.add("Java");//it gives compile time error
		//myList.add(1);
		myList.add(null);
		
		
		
	}
	
	
	public static void addNumber3(List<Object> myList) {
		myList.add(10);
		myList.add("test");
		
	}
	
	
	
	
}
