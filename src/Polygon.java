import java.util.*;

/**
 * A child class of the Shape class, will also serve as a parent class to shapes
 * that are considered Polygons
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public abstract class Polygon extends Shape
{
	/** Where the value of the Shape's perimeter will be stored */
	private double perimeter;
	
	/**
	 * Checks whether the given values are valid and then calculates the perimeter
	 * 
	 * @param sides			The arbitrary amount of sides to be assigned to a Polygon shape
	 */
	protected Polygon(double... sides)
	{
		//Checks if the sides are null value
		if(sides == null)
		{
			throw new IllegalArgumentException("null sides");
		}
		
		//Checks if the number of sides passed is less than 3
		if(sides.length < 3)
		{
			throw new IllegalArgumentException("Invalid number of sides: " 
					+ sides.length);
		}
		
		//Checks if any of the sides are a nonpositive value
		for(double i : sides) 
		{
			if(i <= 0)
			{
				throw new IllegalArgumentException("Nonpositive side: "
						+ i);
			}
		}
		
		//Creates an ArrayList to store the side into, to help with the calculations process
			//and the check for if it is a polygon due to the Polygon inequality rule
		ArrayList<Double> side = new ArrayList<Double>();

		//Adds the passed sides to the ArrayList
		for(double i : sides)
		{
			side.add(i);
		}
		
		//Sorts the sides by size
		Collections.sort(side);
		
		//Where the sum of the sides will be stored into
		double sum = 0;
		
		//For loop to get the sum of the sides, except the largest side
		for(int i = 0; i < side.size() - 1; i++)
		{
			sum = side.get(i) + sum;
		}
		
		//Checks for the polygon inequality, throws an exception if it is violated
		if(side.get(side.size() -1) >= sum)
		{
			throw new IllegalArgumentException("Polygon inequality violated: " 
					+ side.get(side.size() -1) + " >= " + sum);
		}
		
		//Similar code and logic as used above, but in this case we add up every single side
			//and assign that value to perimeter
		double sideSum = 0;
		for(int i = 0; i < side.size(); i++)
		{
			sideSum = side.get(i) + sideSum;
		}
		
		perimeter = sideSum;
	}
	
	/**
	 * Gets the perimeter of a Polygon
	 * 
	 * @return perimeter of Polygon
	 */
	public double getPerimeter()
	{
		return perimeter;
	}
}
