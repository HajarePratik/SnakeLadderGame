public class SnakeLadderGame 
{
	public static final int NO_PLAY = 0 ;
	public static final int LADDER = 1 ;
	public static final int SNAKE = 2 ;
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Snake and Ladder Game");
		
		int startposition=0;
		int newposition=0;
		
		int DieRoll = (int) (Math.random()*6)+1;
		int CheckOption = (int) (Math.random()*3);
		
			switch (CheckOption) 
			{
				case NO_PLAY : 
					newposition = 0;
					break;
				case LADDER :
					newposition = DieRoll ;
					break;
				case SNAKE :
					newposition = -DieRoll ;
					break;
			}
			
			startposition = startposition + newposition;
		
			if (startposition<0)
			{
				startposition = 0;
			}
			System.out.println("Your are Now at "+startposition+"th"+" Position");
	} 
}