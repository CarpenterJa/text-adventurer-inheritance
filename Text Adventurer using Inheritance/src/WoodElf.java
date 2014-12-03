public class WoodElf extends Strong {
	public WoodElf() {
		bosses = (BossFight) new NoBossFight();
		life = 3;
		attack=10;
		sneak = 5;
		items= "potion of healing," + "gold coin," + " and a lootsack";

	}
	@Override 
	public void fightMonster()
	{
		System.out.println("You fight a giant bird and you live with 3 of 3 life.");
	}
	@Override
	public void pickPocket()
	{
		System.out.println("You play it safe and dont try to pickpocket anyone.");
	}

}
