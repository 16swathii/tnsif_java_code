package static_demo;

class Game
{
	static int maxlevel;
	
	static
	{
		System.out.println("Intializating Game settings");
		maxlevel=50;
	}
	void showLevelInfo()
   {
	System.out.println("Game has "+maxlevel+"levels");	
   }
}


public class Static_block_code {

	public static void main(String[] args) {
		Game g1=new Game();
		g1.showLevelInfo();
	}

}