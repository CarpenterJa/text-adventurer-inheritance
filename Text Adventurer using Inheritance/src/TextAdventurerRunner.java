
public class TextAdventurerRunner {

	public static void main(String[] args) {
		StartOfGame [] startofgame = new StartOfGame [4];
		startofgame[0] = new Nord();
		startofgame[1] = new WoodElf();
		startofgame[2] = new Orc();
		startofgame[3] = new Khajiit();
		
		for (int i = 0; i < startofgame.length; i++)
			{	
			startofgame[i].fightMonster();
			startofgame[i].strengthAgainstEnimies();
			startofgame[i].pickPocket();
			startofgame[i].breakChest();
			startofgame[i].bosses.boss();
			System.out.println();
			

	}

}
}
