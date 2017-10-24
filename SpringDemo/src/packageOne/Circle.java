package packageOne;

public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle"); 
		System.out.println("Circle point is: " + center.getX() + " || " + center.getY());
	}
	
	public void myInit(){
		System.out.println("MyInit method called for Circle bean object.");
	}
	
	public void myDestroy(){
		System.out.println("myDestroy init method called for Circle bean object.");
	}

	
}
