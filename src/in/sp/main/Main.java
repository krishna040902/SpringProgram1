package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;
public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		//String config_loc = "/in/sp/resources/applicationContext.xml";
		//context = new ClassPathXmlApplicationContext(config_loc);
		context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std1 = (Student) context.getBean("stdId1");
		std1.display();
	}

}
