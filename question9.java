package training;

import java.util.*;

public class question9{

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> myList = new LinkedHashMap<Integer, String>();
		
		myList.put(1, "A");
		myList.put(2, "B");
		myList.put(3, "C");
		myList.put(4, "D");
		myList.put(5, "E");
		myList.remove(1);
		
		
		Iterator iter = myList.entrySet().iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
	}

}

