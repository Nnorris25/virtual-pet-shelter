
public class VirtualPet {
	int hunger = 50;
	int thirst = 50;
	int boredom = 50;
	int amount = 10;
	private String petName;
	private String petDescription;

	public String getPetName() {
		return petName;
	}

	public String getPetDescription() {
		return petDescription;
	}

	public int getHunger() {
		return hunger;
	}

	public int feedPet() {
		hunger += amount;
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int waterPet() {
		thirst += amount;
		return thirst;

	}

	public int getBoredom() {
		return boredom;
	}

	public int playWithPet() {
		boredom += amount;
		return boredom;
	}

	public String getStatus() {
		String status = "";
		status += "boredom: " + boredom;
		status += "\n";
		status += "thirst: " + thirst;
		status += "\n";
		status += "hunger: " + hunger;
		System.out.println("What would you like to do next? Options are 1,2,3,4,5,6");
		return status;
	}

	public VirtualPet(String petName, String petDescription, int hunger, int thirst, int boredom) {
		super();
		this.petName = petName;
		this.petDescription = petDescription;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

	public void singleTick() {
		hunger++;
		thirst++;
		boredom++;
	}
}
