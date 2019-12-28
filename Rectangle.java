package javapractice;

public class Rectangle extends Shape{
	double rectangleArea;
	
	public Rectangle(double length, double breadth) {
		super(length,breadth);
	}

	public static void main(String[] args) {
		Shape shape = new Rectangle(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
		double finalArea = shape.area();
		System.out.println(finalArea);
	}

	@Override
	double area() {
		rectangleArea = length*breadth;
		return rectangleArea;
		
	}



	
}
