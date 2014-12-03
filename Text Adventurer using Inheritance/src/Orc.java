public class Orc extends Weak {
	public Orc() {
		bosses = (BossFight) new Boss();
		life = 10;
		attack = 3;
		sneak = 5;
		items = "sword," + " chestplate," + " and bread";

	}
	@Override 
	public void fightMonster()
	{
		System.out.println("You fight a wold and kill it with 2 out of 10 left.");
	}
	@Override
	public void pickPocket()
	{
		System.out.println("You try to pickpocket a commoner and you succesfully stole a gold coin.");
	}

}
