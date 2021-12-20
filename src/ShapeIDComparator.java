import java.util.Comparator;

/**
 * Sorts the Shapes by their ID number in ascending order. Done by implementing the Comparator
 * interface
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class ShapeIDComparator implements Comparator<Shape>
{
	/**
	 * Used to compare two passed shapes by their ID number
	 * 
	 * @param s1		one of the shapes passed to be compared
	 * @param s2		one of the shapes passed to be compared
	 */
	public int compare(Shape s1, Shape s2) 
	{
		int first = s1.getID();
		int second = s2.getID();
		
		if(first < second)
		{
			return -1;
		}
		else if(second < first)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
