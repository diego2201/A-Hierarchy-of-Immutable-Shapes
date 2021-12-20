
/**
 * The child class of Rectangle. Used to create a new Square object
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class Square extends Rectangle
{
	/**
	 * Creates a new square object with the passed side value
	 * 
	 * @param side		the value of the sides of the square
	 */
	public Square(double side)
	{
		super(side, side);
	}
	
	/**
	 * Gets the side of the square
	 * 
	 * @return side of square
	 */
	public double getSide()
	{
		double side = super.getTop();
		
		return side;
	}
}
