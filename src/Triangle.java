
/**
 * Extends the parent class Polygon, used to create a Triangle object
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class Triangle extends Polygon
{
	//Where the various sides of a Triangle will be stored
	private double sideA;
	private double sideB;
	private double sideC;
	
	//Where the area of a Triangle will be stored
	private double area;
	
	/**
	 * Passes the sides to the parent class and then creates a new Triangle object
	 * 
	 * @param sideA		One of the sides to be assigned
	 * @param sideB		One of the sides to be assigned
	 * @param sideC		One of the sides to be assigned
	 */
	public Triangle(double sideA, double sideB, double sideC)
	{
		//Passes the values to the parent class
		super(sideA, sideB, sideC);
		
		//Assigns each side
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	/**
	 * Gets sideA of a Triangle
	 * @return sideA of Triangle
	 */
	public double getSideA()
	{
		return sideA;
	}
	
	/**
	 * Gets sideB of a Triangle
	 * @return sideB of Triangle
	 */
	public double getSideB()
	{
		return sideB;
	}
	
	/**
	 * Gets sideC of a Triangle
	 * @return sideC of Triangle
	 */
	public double getSideC()
	{
		return sideC;
	}
	
	//From in class discussion 
	/**
	 * Gets the area of a Triangle using its own unique area formula,
	 * implemented from the Shape class
	 * 
	 * @return area of Triangle
	 */
	public double getArea()
	{
		double s = (sideA + sideB + sideC) / 2;
		area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
		
        return area;
	}
}
