package training;

import java.util.*;

public class question6{

	public static void main(String[] args) {
		LinkedHashSet<Integer> myList = new LinkedHashSet<Integer>();
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.remove(1);
		
		
		Iterator iter = myList.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
	}

}

