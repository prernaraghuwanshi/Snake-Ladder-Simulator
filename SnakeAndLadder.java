public class SnakeAndLadder{
	public static void main(String args[])
	{
		int START = 0;
		int END = 100;
		int positionPlayer1 = 0;
		System.out.println("Welcome to Snake and Ladder Simulator!");
		while(positionPlayer1 != 100)
		{
			int die = (int) (Math.random()*6) + 1; 
			System.out.println("Dice Roll: " + die);

			int option = (int) Math.floor(Math.random() * 10) % 3;
			if( option == 0)
			{
				//No Play
				positionPlayer1=positionPlayer1;
			}
			else if (option == 1)
			{
				//Ladder
				positionPlayer1 += die;
			}
			else if (option == 2)
			{
				//Snake
				positionPlayer1 -= die;
			}
			if(positionPlayer1< 0)
				positionPlayer1 = 0;
			System.out.println("Current Position: "+positionPlayer1);
		}
	}


}