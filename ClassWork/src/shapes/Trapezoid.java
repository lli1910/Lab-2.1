package shapes;

public class Trapezoid implements Shape{
	private int base;
	private int bbase;
	private int height;
	
	public Trapezoid(int base, int bbase, int height)
	{
		this.base = base;
		this.bbase = bbase;
		this.height = height;
	}
	public double calculateArea() {
		// To be written by student
		return ((base + bbase)/2)*height;
	}


	public double calculatePerimeter() {
		// To be written by student
		return (2*length)+(2*width);
	}


	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
