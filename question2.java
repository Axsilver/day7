package training;

import java.util.*;

public class question2{

	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList<Integer>();
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.remove(0);
		
		
		Iterator iter = myList.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
	}

}

