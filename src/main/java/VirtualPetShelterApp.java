import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		VirtualPetShelter cutePets = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);
		VirtualPet pet1 = new VirtualPet("Rocky", " loves people, especially kids!", 80, 76, 50);
		VirtualPet pet2 = new VirtualPet("Rick", " loves going with you on your everyday adventures", 77, 75, 60);
		VirtualPet pet3 = new VirtualPet("Randy", " big swimmer so make sure you have a pool ", 78, 74, 45);
		cutePets.addPet(pet1);
		cutePets.addPet(pet2);
		cutePets.addPet(pet3);
		System.out.println("Welcome to Nate's animal shelter");
		System.out.println("Here is a list of all the pets we have for adoption!");
		System.out.println("Name   \t|Type     \t|Hunger   \t|Thirst   \t|Boredom");
		System.out.println("-------\t|---------\t|---------\t|---------\t|-------");
		System.out.println("Rocky  \t|Dog      \t|50       \t|50       \t|50     ");
		System.out.println("Rick   \t|Dog      \t|50       \t|50       \t|50     ");
		System.out.println("Randy  \t|Dog      \t|50       \t|50       \t|50     ");

		System.out.println("What would you like to do next?");
		System.out.println(
				"1. Feed the pets\n2. Water the pets\n3. Play with a pet\n4. Adopt a pet\n5. Admit a pet\n6. Quit ");
		boolean keepPlaying = true;
		
			 while (keepPlaying){
			String command = input.nextLine();

			if (command.equalsIgnoreCase("1")) {
				cutePets.tickAllPets();
				cutePets.feedAllPets();
				System.out.println(pet1.getStatus());
				System.out.println(pet2.getStatus());
				System.out.println(pet3.getStatus());
			} else if (command.equalsIgnoreCase("2")) {
				cutePets.tickAllPets();
				cutePets.waterAllPets();
				System.out.println(pet1.getStatus());
				System.out.println(pet2.getStatus());
				System.out.println(pet3.getStatus());
			}
			else if (command.equalsIgnoreCase("3")) {
				System.out.println("Which pet would you like to play with?");
				String command2 = input.nextLine();
				cutePets.playWithPet(command2);
				cutePets.tickAllPets();
				System.out.println("You played fetch with " + command2);
				System.out.println(pet1.getStatus());
				System.out.println(pet2.getStatus());
				System.out.println(pet3.getStatus());
			} else if (command.equalsIgnoreCase("4")) {
				System.out.println("Which pet would you like to adopt?");
				String command3 = input.nextLine();
				cutePets.adoptPet(command3);
				System.out.println("You have adopted " + command3);

			}else if (command.equalsIgnoreCase("5")) {
		 System.out.println("What is the name of the pet you want to add?");
		 String newPet = input.nextLine();
		 System.out.println("What's " + newPet +" like? ");
		 String newPetDescription = input.nextLine();
		 VirtualPet newAddition = new VirtualPet(newPet, newPetDescription, 50, 50, 50);
		 cutePets.addPet(newAddition);
		 System.out.println("Thanks for adding " + newPet + " what would you like to do now? Options are 1, 2, 3, 4, 5, 6");
			 }else if (command.equals("6")) {
				 System.out.println("You have quit the program, you suck, go die.");
			 
				 System.exit(0);
		 

		
	}
	}}}
