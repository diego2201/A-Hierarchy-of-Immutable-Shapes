
/**
 * The child class of Triangle. Used to create a new RightTriangle Object
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class RightTriangle extends Triangle
{
	/**
	 * Passes the given values to the parent constructor, in this case Triangle, and then assigns
	 * sideA and sideB to base and height, and then calculates the length of sideC (hypotenuse) 
	 * and assigns it
	 * 
	 * @param base		base of the RightTriangle to be assigned
	 * @param height	height of the RightTrianlge to be assigned
	 */
	public RightTriangle(double base, double height)
	{
		super(base, height, Math.sqrt((base * base) + (height * height)));
	}
	
	/**
	 * Gets the base of the RightTriangle
	 * 
	 * @return base of RightTriangle
	 */
	public double getBase()
	{
		return super.getSideA();
	}
	
	/**
	 * Gets the height of the RightTriangle
	 * 
	 * @return height of RightTriangle
	 */
	public double getHeight()
	{
		return super.getSideB();
	}
	
	/**
	 * Gets the hypotenuse of the RightTriangle
	 * 
	 * @return the hypotenuse of RightTriangle
	 */
	public double getHypotenuse()
	{
		return super.getSideC();
	}
}
