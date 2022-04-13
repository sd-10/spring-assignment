package springassignment.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Cat cat1=(Cat)context.getBean("cat1");
		Dog dog1=(Dog)context.getBean("dog1");
		Person p = (Person)context.getBean("person1");
		//Animal a=(Animal)context.getBean("animal1");
		
		System.out.println(cat1.getDetails());
		System.out.println(dog1.getDetails());
		System.out.println(p.getDetails());
		
	
	}

}
