
/**
 * A child class of Polygon, will also serve as a parent class to Rectangle and Square,
 * and used to create a new IsoscelesTrapezoid Object
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class IsoscelesTrapezoid extends Polygon
{
	//Where the respective values of Trapezoid will be stored
	private double top;
	private double base;
	private double leg;
	
	//Where the area of a Trapezoid will be stored
	private double area;
	
	/**
	 * Passes the given values to the parent constructor, to make sure they are valid lengths
	 * and then assigns them
	 * 
	 * @param top		The top of the trapezoid to be assigned
	 * @param base		The base of the trapezoid to be assigned
	 * @param leg		The leg of the trapezoid to be assigned
	 */
	public IsoscelesTrapezoid(double top, double base, double leg)
	{
		super(top, base, leg, leg);
		this.top = top;
		this.base = base;
		this.leg = leg;
	}
	
	/**
	 * Gets the top of a IsoscelesTrapezoid
	 * 
	 * @return top of IsoscelesTrapezoid
	 */
	public double getTop()
	{
		return top;
	}
	
	/**
	 * Gets the base of a IsoscelesTrapezoid
	 * 
	 * @return base of IsoscelesTrapezoid
	 */
	public double getBase()
	{
		return base;
	}
	
	/**
	 * Gets the leg of a IsoscelesTrapezoid
	 * 
	 * @return leg of IsoscelesTrapezoid
	 */
	public double getLeg()
	{
		return leg;
	}
	
	/**
	 * Gets the area of a IsoscelesTrapezoid, by calculating the area of the center rectangle and
	 * the two side triangles and then adding them up
	 * 
	 * @return area of IsoscelesTrapezoid
	 */
	public double getArea()
	{	
		//Creats a new Rectangle object
		Rectangle rectangle = getCenterRectangle();
		
		//Gets the width of the rectangle
		double width = rectangle.getWidth();
		
		//Gets the height of the rectangle
		double height = rectangle.getHeight();
		
		//Calculates the area of the rectangle
		double rectangleArea = (width * height);
				
		//Advice from Braden
		//Where the value of the sideTriangle area will be stored
		double triArea = 0;
		
		//Checks to make sure that none of the values are 0 or nonpositive
		if((top - base) > 0 || (base - top) > 0)
		{
			//If everything is valid then creates a new RightTriangle object
			RightTriangle sideTri = getSideTriangle();
			
			//Gets the area of the side triangle
			triArea = sideTri.getArea();
		}
		
		//Calculates the area of the Trapezoid
		area = (rectangleArea) + (triArea * 2);
		
		return area;
	}
	
	/**
	 * Creates a new Rectangle object
	 * @return new Rectangle object
	 */
	public Rectangle getCenterRectangle()
	{
		double smallerValue = 0;
		double bottom = 0;
		
		//Checks to find which side is the top and which is the bottom
		if(top < base)
		{
			smallerValue = top;
			bottom = (base - top) / 2;
		}
		else
		{
			smallerValue = base;
			bottom = (top - base) / 2;
		}
		
		//Calculates the height of the rectangle
		double height = Math.sqrt(Math.pow(leg, 2) - Math.pow(bottom, 2));
		
		//Creates new rectangle with the given values
		Rectangle rectangle = new Rectangle(smallerValue, height);
		return rectangle;
	}
	
	/**
	 * Creates a new RightTriangle object
	 * @return new RightTriangle object
	 */
	public RightTriangle getSideTriangle()
	{
		double bottom = 0;
		
		//Checks to find which side is the top and which is the bottom
		if(top < base)
		{
			bottom = (base - top) / 2;
		}
		else
		{
			bottom = (top - base) / 2;
		}
		
		//Calculates the height of the RightTriangle
		double height = Math.sqrt(Math.pow(leg, 2) - Math.pow(bottom, 2));

		//Creates new RightTriangle with the given values
		RightTriangle sideTri = new RightTriangle(bottom, height);
		return sideTri;
	}
}
