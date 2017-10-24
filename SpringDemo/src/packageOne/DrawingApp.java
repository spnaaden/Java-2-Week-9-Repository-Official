package packageOne;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
		
		//Testing GitHub changes
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape triangleShape = (Shape) context.getBean("triangle-alias");
		triangleShape.draw();
		
		Shape squareShape = (Shape) context.getBean("square-name");
		squareShape.draw();
		
		Shape circleShape = (Shape) context.getBean("circle-name");
		circleShape.draw();
		
		Shape pentagonShape = (Shape) context.getBean("pentagon-name");
		pentagonShape.draw();
	}

}
