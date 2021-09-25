
public class Pet {

	//class fields
	public String petName;
	public String petType;
	public String petBreed;
	public String petColor;
	public String petAge;
	public String petSex;
	public String petOwnersName;
	
	//name and type only
	public Pet(String name, String type) {
		
		this.petName = name;
		this.petType = type;
		
	}
	
	//name, type and breed constructor
	public Pet(String name, String type, String breed) {
		
		this.petName = name;
		this.petType = type;
		this.petBreed = breed;
	}
	
	//name, type, breed and color constructor
	public Pet(String name, String type, String breed, String color) {
		
		this.petName = name;
		this.petType = type;
		this.petBreed = breed;
		this.petColor = color;
	}
	
	//name, type, breed, color and age constructor
	public Pet(String name, String type, String breed, String color, String age) {
		
		this.petName = name;
		this.petType = type;
		this.petBreed = breed;
		this.petColor = color;
		this.petAge = age;
	}
	
	//name, type, breed, color, age and sex constructor
	public Pet(String name, String type, String breed, String color, String age, String sex) {
		
		this.petName = name;
		this.petType = type;
		this.petBreed = breed;
		this.petColor = color;
		this.petAge = age;
		this.petSex = sex;
	}
	
	//name, type, breed, color, age, sex, and owners name constructor
	public Pet(String name, String type, String breed, String color, String age, String sex, String ownersName) {
		
		this.petName = name;
		this.petType = type;
		this.petBreed = breed;
		this.petColor = color;
		this.petAge = age;
		this.petSex = sex;
		this.petOwnersName = ownersName;
	}
	
	
	//to print the output this method will be access by the object name in main class
	public void ShowDetails() {
		
		System.out.println("Your pet's name is : " + this.petName);
		System.out.println("Your pet's type is : " + this.petType);
		System.out.println("Your pet's breed is : " + this.petBreed);
		System.out.println("Your pet's color is : " + this.petColor);
		System.out.println("Your pet's age is : " + this.petAge);
		System.out.println("Your pet's sex is : " + this.petSex);
		System.out.println("Your pet's owner's name is : " + this.petOwnersName + "\n");
		
	}
}
