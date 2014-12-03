import java.util.*;

public abstract class StartOfGame {
	protected BossFight bosses;
	protected int life = 0;
	protected int attack = 0;
	protected int sneak=0;
	protected String items;
	
	public abstract void fightMonster();
	public abstract void strengthAgainstEnimies();
	public abstract void pickPocket();
	public void breakChest()
	{
		System.out.println("You found " + items + " inside the chest.");
	}

}
