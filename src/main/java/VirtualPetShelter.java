import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	Map<String, VirtualPet> pets = new HashMap<>();
	int hunger=50;
	int thirst=50;
	int boredom=50;

	public Collection<VirtualPet> getPets() {
		return pets.values();
	}

	public VirtualPet getAPet(String petName) {
		return pets.get(petName);
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);
	}

	public void adoptPet(String petName) {
		pets.remove(petName);
	}

	public void feedAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.feedPet();
			hunger = hunger-15;
		}
	}
	public void feedAPet(String petName) {
		getAPet(petName).feedPet();

	}
	public void waterAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.waterPet();
			thirst=thirst-15;
		}
	}
	public void waterAPet(String petName) {
		getAPet(petName).waterPet();

	}
	public void playWithPet(String petName) {
		getAPet(petName).playWithPet();

	}
	public void playWithAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.playWithPet();
			boredom=boredom-15;
		}
	}
	public void tickAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.singleTick();
		}
	}

}
