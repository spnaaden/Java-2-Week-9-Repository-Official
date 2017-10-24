package packageOne;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware, Shape {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	
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
	
	/*private String type;
	private int height;
	
	
	public Triangle(String type){
		this.type = type;
	}
	
	public Triangle(int height){
		this.height = height;
	}
	
	public Triangle(String type, int height){
		this.type = type;
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
	 */


	public void draw(){
		
		System.out.println("Drawing Triangle"); 
		System.out.println("Point A: " + getPointA().getX() + " || " + getPointA().getY());
		System.out.println("Point B: " + getPointB().getX() + " || " + getPointB().getY());
		System.out.println("Point C: " + getPointC().getX() + " || " + getPointC().getY()); 
	}
	
	public void myInit(){
		System.out.println("MyInit method called for Triangle bean object.");
	}
	
	public void myDestroy(){
		System.out.println("myDestroy init method called for Triangle bean object.");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) 
			throws BeansException {
			this.context = applicationContext;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bean Name: " + name);
	}

	/*@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("IntializingBean init method called for Triangle bean object.");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean init method called for Triangle bean object.");
	}*/
}
