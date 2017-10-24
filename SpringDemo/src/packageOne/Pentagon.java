package packageOne;

public class Pentagon implements Shape {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	private Point pointE;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public Point getPointD() {
		return pointD;
	}
	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}
	public Point getPointE() {
		return pointE;
	}
	public void setPointE(Point pointE) {
		this.pointE = pointE;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Pentagon"); 
		System.out.println("Point A: " + getPointA().getX() + " || " + getPointA().getY());
		System.out.println("Point B: " + getPointB().getX() + " || " + getPointB().getY());
		System.out.println("Point C: " + getPointC().getX() + " || " + getPointC().getY());
		System.out.println("Point D: " + getPointD().getX() + " || " + getPointD().getY()); 
		System.out.println("Point E: " + getPointE().getX() + " || " + getPointE().getY()); 
	}
	
	public void myInit(){
		System.out.println("MyInit method called for Pentagon bean object.");
	}
	
	public void myDestroy(){
		System.out.println("myDestroy init method called for Pentagon bean object.");
	}
	
	
	
}
