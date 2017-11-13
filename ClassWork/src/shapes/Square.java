package shapes;

public class Square extends Rectangle {

	int side;
	Rectangle square = new Rectangle.calculateArea();

	public Square(int side) {
		super(side, side);
		this.side = side;
		
	}

	@Override
	public String toString() {
		// To be written by student
		return square.calculateArea;
	}

}
