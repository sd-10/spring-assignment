package springassignment.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springassignment.model.Cat;
import springassignment.model.Dog;
import springassignment.model.Person;

@Configuration
public class AppConfig {

	@Bean("cat1")
	public Cat getCat()
	{
		Cat c=new Cat("White-black","Persian");
		return c;
	}
	
	@Bean("dog1")
	public Dog getDog()
	{
		Dog d=new Dog("Black","Doverman");
		return d;
	}
	
	@Bean("p")
	public Person getPerson()
	{
		Person person=new Person("Mark","Spector");
		return person;
	}
}
