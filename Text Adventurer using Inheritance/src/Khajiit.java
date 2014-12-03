public class Khajiit extends Weak {
	public Khajiit() {
		bosses = (BossFight) new NoBossFight();
		life = 4;
		attack = 4;
		sneak = 10;
		items = "key," + " water," + " and bread";

	}
	@Override 
	public void fightMonster()
	{
		System.out.println("You fight a dragon and you sneak away because he his to strong of an enemy and you have 1 health of 4 left.");
	}
	@Override
	public void pickPocket()
	{
		System.out.println("You pickpocket the king you recieve 100 gold coins.");
	}

}
