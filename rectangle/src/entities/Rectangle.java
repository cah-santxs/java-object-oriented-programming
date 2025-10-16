package entities;

public class Rectangle {

	public double width;
	public double high;

public double area() {
	return width * high;
	}
public double perimeter() {
	return 2 * (width + high);
	}
public double diagonal() {
	return Math.sqrt(Math.pow(width, 2) + Math.pow(high, 2));
	}
}
