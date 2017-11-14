package shapes;

public class Triangle implements Shape{
	private int base;
	private int height;
	private int side2;
	private int side3;
	
	public Triangle(int base, int height, int side2, int side3)
	{
		this.base = base;
		this.height = height;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double calculateArea()
	{
		return(0.5*base*height);
	}
	public double calculatePerimeter()
	{
		return(base + side2 + side3);
	}
}
