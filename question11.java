package training;

import java.util.*;

class Rock implements Comparable<Rock>
{
	private int size;
	
	public Rock(int size)
	{
		this.size = size;
	}
	
	public int compareTo(Rock r)
	{
		return this.size - r.size;
	}
	
	public int getSize()
	{
		return this.size;
	}
}

class RockCompare implements Comparator<Rock>
{
	public int compare(Rock rock1, Rock rock2)
	{
		return rock1.getSize() - rock2.getSize();
	}
}


public class question11{

	public static void main(String[] args) {
		
		Rock rock1 = new Rock(10);
		Rock rock2 = new Rock(12);
		
		System.out.println(rock1.compareTo(rock2));
		
		RockCompare rc = new RockCompare();
		
		System.out.println(rc.compare(rock1, rock2));
		
		
		
		
	}

}
