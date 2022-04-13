package springassignment.model;


public class Animal {

	
	/* 1.	Create an Animal class with fields 
2.	Create at least 2 subclasses of Animal class
3.	Subclasses will override one method from Animal class
4.	Use Spring IOC container to create object of subclass at runtime and 
Call the method.
*/
	
	private int id;
	private String species;
	private String colour;
	Animal()
	{
		
	}
	public Animal(int id, String species, String colour) {
		super();
		this.id = id;
		this.species = species;
		this.colour = colour;
	}
	Animal(String colour)
	{
		this.colour=colour;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getDetails()
	{
		return species+" is an animal whose colour is "+colour+" and its id is: "+id;
	}
	
}
