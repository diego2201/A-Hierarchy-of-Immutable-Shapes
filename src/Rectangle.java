
/**
 * A child class of the IsoscelesTrapezoid class. Used to create a new Rectangle
 * object, and serves as the parent class to Square class
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class Rectangle extends IsoscelesTrapezoid
{
	/**
	 * Passes the given values to the parent constructor and 
	 * assigns the top and base and the height to leg.
	 * 
	 * @param width			The width to be assigned to the top and base
	 * @param height		The height to be assigned to the leg
	 */
	public Rectangle(double width, double height)
	{
		super(width, width, height);
	}
	
	/**
	 * Gets the width of the rectangle
	 * 
	 * @return width rectangle
	 */
	public double getWidth()
	{
		return super.getTop();
	}
	
	/**
	 * Gets the height of the rectangle
	 * @return height of rectangle
	 */
	public double getHeight()
	{
		return super.getLeg();
	}
}
