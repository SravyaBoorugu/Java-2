package javapractice;

public class Circle extends Shape{
    double circleArea;
    final double pi = 3.14;
    
	public Circle(double radius){
		super(radius);
	}

	public static void main(String[] args) {
		Shape circle = new Circle(Double.parseDouble(args[0]));
		double finalCircleArea = circle.area();
		System.out.println(finalCircleArea);
}
	double area() {
		circleArea = pi * radius * radius;
		return circleArea;
		
	}

}
