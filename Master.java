import java.util.Scanner;

    interface Inter{
	String getType();
	double area();
	String getMessage();
}

   class Circle implements Inter{
	private String message = "Circle.";
	private double radius;

	public String getMessage() {
		return message;
	}

	public String getType() {
		return "2D Shape.";
	}

	public void setRadius(double radius) {
		if(radius >= 0) {
			this.radius = radius;
		}else {
			this.radius = 0;
		}
	}

	public double getRadius() {
		return radius;
	}

	    public double area() {
		return Math.PI * radius * radius;
	}
}



class Square implements Inter{
	private String message = "Square.";
	private double side;

	public String getMessage() {
		return message;
	}

	public String getType() {
		return "2D Shape.";
	}

	public void setSide(double side) {
		if(side >= 0) {
			this.side = side;
		}else {
			this.side = 0;
		}
	}

	public double getSide() {
		return side;
	}

	public double area() {
		return side * side;
	}
}

public class Master {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Circle circle = new Circle();

		System.out.println("Enter the radius for the circle: ");
		double r = input.nextDouble();
		circle.setRadius(r);

		System.out.println("Message: " + circle.getMessage());
		System.out.println("Type of the shape: " + circle.getType());
		System.out.println("The radius of the circle is: " + circle.getRadius());
		System.out.println("So, the area will be: " + circle.area());

		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println();

		Square square = new Square();

		System.out.println("Enter the length of the side of your square: ");
		double s = input.nextDouble();
		square.setSide(s);

		System.out.println("Message: " + square.getMessage());
		System.out.println("Type of the shape: " + square.getType());
		System.out.println("The length of the side of your square is: " + square.getSide());
		System.out.println("So, the area will be: " + square.area());

	}

}
