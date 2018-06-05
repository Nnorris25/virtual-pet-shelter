import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPetShelter testPetShelter = new VirtualPetShelter();
//	@Test
//	public void getPetsShouldReturnAllPets(){
//		//Arrange
//		testPetShelter.addPet(new VirtualPet("Johnny", "Dog", 50, 50, 50));
//		Collection underTest = testPetShelter.getPets();
//		Assert.assertEquals("Johnny", underTest);
		
	@Test
	public void shouldDecreaseHungerBy12WhenFeeding() {
		VirtualPet petTestFeedAllPets = new VirtualPet(null, null, 0, 0, 0);
		testPetShelter.addPet(petTestFeedAllPets);
		int preTest = petTestFeedAllPets.getHunger();
		testPetShelter.feedAllPets();
		int underTest = petTestFeedAllPets.getHunger();
		assertTrue(underTest == (preTest -15));
	}
		
		//Act
		
		//Assert
	{
		@Test
		public void shouldDecreaseThirstBy15WhenWatering() {
			VirtualPet petTestWaterAll = new VirtualPet();
			testPetShelter.addPet(petTestWaterAll);
			int preTest = petTestWaterAllPets.getThirst();
			testPetShelter.waterAllPets();
			int underTest = petTestWaterAll.getThirst();
			assertTrue(underTest == (preTest - 15));
		}


	}
}
