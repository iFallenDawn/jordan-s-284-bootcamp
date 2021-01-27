
public class Rectangle {
	private double length, width;
	private String name;
	public Rectangle() {
		length = 0;
		width = 0;
		name = "Pablo";
	}
	public Rectangle(double length, double width, String name) {
		this.length = length;
		this.width = width;
		this.name = name;
	}
	public double getArea() {
		double area = length * width;
		return area;
	}
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("Length: " + length + "\n");
		s.append("Width: " + width + "\n");
		s.append("Area: " + getArea() + "\n");
		s.append("Name: " + name + "\n");
		return s.toString();
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println(r.getArea());
		r = new Rectangle(2, 2, "2");
//		System.out.println(r.getArea());
//		System.out.println(r.getName());
		System.out.println(r);
	}
}
