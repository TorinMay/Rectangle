import java.awt.Color;

public class Rectangle {
	
	//State	
	private double width;
	private double length;
	public int x = 4;
	public int y = 5;

	//Constructor
	public Rectangle(double width, double length) {
		setLength(length);
	}
	//Getters and setters
	public double length() {
		return length;
	}
	public void setLength(Double legnth) {
		if(length > 0) {
			this.length = length;
		}
	}

	public double width() {
		return width;
	}
	public void setWidth(Double width) {
		if(width > 0) {
			this.width = width;
		}
	}

	//Behavior
	public void draw() {
		for(int i=0; i<y; i++){ 
			for(int j=0; j<x; j++) { 
				System.out.print("*"); 
		} 
		System.out.println(); 
		} 
	} 

	public double area() {
		double area = y * x;
		return area;
	}
	
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(5,4);
		rec.draw();
		System.out.println("---------------------");
		System.out.println("Area is " + rec.area());
	}
}