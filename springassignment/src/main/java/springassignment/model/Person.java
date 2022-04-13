package springassignment.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	private String firstName;
	private String lastName;
	@Autowired
	private Animal a;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Animal getA() {
		return a;
	}
	public void setA(Animal a) {
		this.a = a;
	}
	
	public String getDetails()
	{
		return firstName+" "+lastName+" owns animal "+a.getSpecies();
	}
	
}
