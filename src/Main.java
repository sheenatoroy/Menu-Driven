import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("--WELCOME TO PET SHOP--");
		
		//do the print statement 
		do {
		System.out.println("CHOOSE YOUR TRANSACTION \n" + "A. Register\n" + "B. Exit");
		char choices = reader.readLine().charAt(0);
		
		//if the user chose 1 then equals it equals to 'B'
		//it will print the pet information that only the user can be entered depending on his/her choice
		if(choices == 'A' || choices == 'a') {
			
			System.out.println("CHOOSE TO RECORD YOUR PET INFORMATION");
			System.out.println("1. Pet Name and Type (Dog or Cat) ");
			System.out.println("2. Pet Name, Type (Dog or Cat) and Breed ");
			System.out.println("3. Pet Name, Type (Dog or Cat), Breed and Color");
			System.out.println("4. Pet Name, Type (Dog or Cat), Breed, Color and Age");
			System.out.println("5. Pet Name, Type (Dog or Cat), Breed, Color, Age and Sex");
			System.out.println("6. Pet Name, Type (Dog or Cat), Breed, Color, Age, Sex and Owner's Name");
			char selection = reader.readLine().charAt(0);
			
			if(selection == '1') {
				
				System.out.println("Enter your pet's name: ");
				String name = reader.readLine();
				
				System.out.println("Enter your pet's type: (Dog/Cat) " );
				String type = reader.readLine();
				
				Pet pet = new Pet(name, type);
				pet.ShowDetails();
				
			}else if(selection == '2') {
				
				System.out.println("Enter your pet's name: ");
				String name = reader.readLine();
				
				System.out.println("Enter your pet's type: (Dog/Cat) " );
				String type = reader.readLine();
			
				System.out.println("Enter your pet's breed: ");
				String breed = reader.readLine();
				
				Pet pet1 = new Pet(name, type, breed);
				pet1.ShowDetails();
				
			}else if(selection == '3') {
				
				System.out.println("Enter your pet's name: ");
				String name = reader.readLine();
				
				System.out.println("Enter your pet's type: (Dog/Cat) " );
				String type = reader.readLine();
			
				System.out.println("Enter your pet's breed: ");
				String breed = reader.readLine();
				
				System.out.println("Enter your pet's color: ");
				String color = reader.readLine();
				
				Pet pet2 = new Pet(name, type, breed, color);
				pet2.ShowDetails();
				
			}else if(selection == '4') {
				

				System.out.println("Enter your pet's name: ");
				String name = reader.readLine();
				
				System.out.println("Enter your pet's type: (Dog/Cat) " );
				String type = reader.readLine();
			
				System.out.println("Enter your pet's breed: ");
				String breed = reader.readLine();
				
				System.out.println("Enter your pet's color: ");
				String color = reader.readLine();
				
				System.out.println("Enter your pet's age: ");
				String age = reader.readLine();
				
				Pet pet3 = new Pet(name, type, breed, color, age);
				pet3.ShowDetails();
			
			}else if(selection == '5') {
				
				System.out.println("Enter your pet's name: ");
				String name = reader.readLine();
				
				System.out.println("Enter your pet's type: (Dog/Cat) " );
				String type = reader.readLine();
			
				System.out.println("Enter your pet's breed: ");
				String breed = reader.readLine();
				
				System.out.println("Enter your pet's color: ");
				String color = reader.readLine();
				
				System.out.println("Enter your pet's age: ");
				String age = reader.readLine();
					
				System.out.println("Enter your pet's sex: ");
				String sex = reader.readLine();
				
				Pet pet4 = new Pet(name, type, breed, color, age, sex);
				pet4.ShowDetails();
				
			}else if(selection == '6') {
				
				System.out.println("Enter your pet's name: ");
				String name = reader.readLine();
				
				System.out.println("Enter your pet's type: (Dog/Cat) " );
				String type = reader.readLine();
			
				System.out.println("Enter your pet's breed: ");
				String breed = reader.readLine();
				
				System.out.println("Enter your pet's color: ");
				String color = reader.readLine();
				
				System.out.println("Enter your pet's age: ");
				String age = reader.readLine();
					
				System.out.println("Enter your pet's sex: ");
				String sex = reader.readLine();
				
				System.out.println("Enter your pet's owners name: ");
				String ownersName = reader.readLine();
				
			
				Pet pet5 = new Pet(name, type, breed, color, age, sex, ownersName);
				pet5.ShowDetails();
				
			
			}else {
				
				System.out.println("INVALID SELECTION");
			
			}
			
			}else if(choices == 'B' || choices == 'b') {
			
			System.out.println("SYSTEM EXIT");
			
				//to terminate
				break;
		}else {
			
			System.out.println("INVALID INPUT\n");
		}
		
		//while it is true
		//while the user keep choosing the register transaction 
		}while(true);
	}

}
