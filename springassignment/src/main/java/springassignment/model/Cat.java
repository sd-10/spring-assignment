package springassignment.model;

public class Cat extends Animal {

	private String breed;
	public Cat()
	{
		
	}
	public Cat(String colour,String breed)
	{
		super(colour);
		this.breed=breed;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getDetails()
	{
		return this.getSpecies()+" has colour "+this.getColour()+" and its id is : "+this.getId();
	}
}
