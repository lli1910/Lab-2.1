package shapes;

public class Pentagon implements Shape{
	
	private int side;

	public Pentagon(int side) {
		this.side = side;
	}


	public double calculateArea() {
		// To be written by student
		return (0.25 * Math.sqrt(5 * (5 + 2 *(Math.sqrt(5)) * (Math.pow(side, 2)))));
	}


	public double calculatePerimeter() {
		// To be written by student
		return (5 * side);
	}


	public String toString() {
		return "Pentagon side length: " + side +  " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
