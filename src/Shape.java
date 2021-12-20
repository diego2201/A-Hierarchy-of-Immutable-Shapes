import java.util.*;

/**
 * This class is the top class in the hierarchy, and it represents any 2D shape. 
 * It implements the Comparable interface, and contains abstract methods for the subclasses
 * to implement.
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public abstract class Shape implements Comparable<Shape> 
{
	/** The id of a given shape */
	private int id;
	
	/** Used to help increment the id numbers */
	private static int nextID = 0;
	
	/**
	 * Assigns an id number to a shape
	 */
	protected Shape()
	{
		//Assigns nextID to id
		id = nextID;
		
		//Increments the ID number
		nextID = nextID + 1;
	}

	/**
	 * Gets the ID of a shape
	 * 
	 * @return id number of a shape
	 */
	public int getID() 
	{
		return id;
	}
	
	/**
	 * An abstract method to get the perimeter of a shape. Needs to be implemented
	 * for the subclasses
	 * 
	 * @return the perimeter of a shape
	 */
	public abstract double getPerimeter();

	/**
	 * An abstract method to get the area of a shape. Needs to be implemented
	 * for the subclasses
	 * 
	 * @return the area of a shape
	 */
	public abstract double getArea();
	
	/**
	 * Sorts the collection of Shapes, first sorted by type, then perimeter, and lastly area.
	 * then compares the two shapes and returns a given value
	 * 
	 * @param other			the shape to be compared
	 */
	public int compareTo(Shape other)
	{
		//Creates the shape objects to be compared, using the given syntax 
			//from the README
		String firstName = getClass().getName();
		String secondName = other.getClass().getName();
		
		//Creates and ArrayList where the objects will be stored
			//This helps when sorting the list
		ArrayList<String> list = new ArrayList<String>();
		list.add(firstName);
		list.add(secondName);
		
		//Uses the sort method to sort the list
		Collections.sort(list);
		
		//Sorts by name
		if(firstName == list.get(0) && firstName != secondName)
		{
			return -1;
		}
		else if(firstName == list.get(1) && firstName != secondName)
		{
			return 1;
		}
		
		//Sorts by perimeter
		if(getPerimeter() < other.getPerimeter())
		{
			return -1;
		}
		else if(getPerimeter() > other.getPerimeter())
		{
			return 1;
		}
		
		//Sorts by Area
		if(getArea() < other.getArea())
		{
			return -1;
		}
		else if(getArea() > other.getArea())
		{
			return 1;
		}
		
		return 0;
	}
	
	@Override
	/**
	 * Helps print out the object
	 */
	public String toString() 
	{
		return "<"
				+ getClass().getName()
				+ ", ID: " + id
				+ ", PERIMETER: " + String.format("%.1f", getPerimeter())
				+ ", AREA: " + String.format("%.1f", getArea())
				+ ">";
	}
}
