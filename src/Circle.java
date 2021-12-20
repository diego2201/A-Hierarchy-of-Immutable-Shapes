
/**
 * A child class of the shape class. Implements various methods specific to the circle shape,
 * and also implements its own getPerimeter and getArea method as dictated by the parent class.
 * 
 * @author Diego cifuentes
 * @version 1
 */
public class Circle extends Shape 
{
	/** Where the value of the circle's radius will be stored */
	private double radius;
	
	/**
	 * Checks to make sure the passed radius value is valid, if so then it assigns the 
	 * passed radius value to the instance variable above, radius
	 * 
	 * @param radius		The passed radius to be checked and then assigned
	 */
	public Circle(double radius) 
	{
		//Checks to make sure the passed radius value is not a 
			//nonpositive value
		if(radius <= 0)
		{
			throw new IllegalArgumentException("Nonpositive radius: " + radius);
		}
		
		//Assigns the passed radius to the private variable radius
		this.radius = radius;
	}
	
	/**
	 * Gets the radius of the Circle
	 * 
	 * @return radius of Circle
	 */
	public double getRadius()
	{
		return radius;	
	}
	
	@Override
	/**
	 * Implements the abstract method from parent class. Gets the perimeter of a circle
	 * 
	 * @return perimeter of Circle
	 */
	public double getPerimeter()
	{
		//Calculation for the perimeter of a Circle
		double perimeter = 2 * Math.PI * radius;
		
		return perimeter;
	}
	
	@Override
	/**
	 * Implements the abstract method from parent class. Gets the area of a circle
	 * 
	 * @return area of Circle
	 */
	public double getArea()
	{
		//Calculation for area of a circle
		double area = Math.PI * radius * radius;

		return area;
	}

}
