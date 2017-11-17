package shapes;

public class Triangle implements Shape{
	private int side1;
	private int side2;
	private int side3;
	
	public Triangle(int side1, int side2, int side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double calculateArea()
	{
		double p = halfPerimeter();
		double area = Math.sqrt(p*(p - side1)*(p - side2)*(p-side3));
		return area;
	}
	public double calculatePerimeter()
	{
		return side1 + side2 + side3;
	}
	public String toString() {
		if(side1 <= (side2 + side3)|| side2 <= (side1 + side3) || side3 <= (side1+side2)) {
			return("Unable to form a triangle");
		}
		
		return "Triangle side length: " + side1 +"/" + side2 + "/" + side3 + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
	private double halfPerimeter() {
		double halfPerimeter = (side1 + side2 + side3) / 2;
		return halfPerimeter;
	}
}
