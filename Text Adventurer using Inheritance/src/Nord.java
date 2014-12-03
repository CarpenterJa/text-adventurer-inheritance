
public class Nord extends Strong{
	public Nord()
	{
    bosses= (BossFight) new Boss();
	life = 6;
	attack = 6;
	sneak=6;
	items = "helmet," + " bow, " + " and a bandage";
	}
	@Override 
	public void fightMonster()
	{
		super.life(5);
		System.out.println("You fight a giant cave spider and win with just 5 out of " + life + " life.");
	}
	@Override
	public void pickPocket()
	{
		System.out.println("You get cocky and try to pickpocket the duke and get sent to jail for one year.");
	}
	
    
}
