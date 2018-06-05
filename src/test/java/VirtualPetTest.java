import static org.junit.Assert.assertTrue;

public class VirtualPetTest {
	
	VirtualPet testPet = new VirtualPet();

	@Test
	public void shouldPerformTickIncreaseHungerBoredomThirstBy2() {
		int preTestHunger = testPet.getHunger();
		int preTestThirst = testPet.getThirst();
		int preTestBoredom = testPet.getBoredom();
		testPet.singleTick();
		int underTestHunger = testPet.getHunger();
		int underTestThirst = testPet.getThirst();
		int underTestBoredom = testPet.getThirst();
		assertTrue(preTestHunger ++ == underTestHunger && preTestThirst ++== underTestThirst
				&& preTestBoredom ++ == underTestBoredom);
	}
}
