package packageOne;

import java.util.List;

public class Square implements Shape {

	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw(){
		
		System.out.println("Drawing Square");
		for(Point point : points) {
			System.out.println("Point = " + point.getX() + " || " + point.getY());
		}
	}
	
	public void myInit(){
		System.out.println("MyInit method called for Square bean object.");
	}
	
	public void myDestroy(){
		System.out.println("myDestroy init method called for Square bean object.");
	}

	
}
