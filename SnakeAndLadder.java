public class SnakeAndLadder{
	
	public static void main(String args[])
	{
		int START = 0;
		int END = 100;
		int positionPlayer1 = 0;
		int positionPlayer2 = 0;
		int numberOfDiceRollsP1 = 0;
		int numberOfDiceRollsP2 = 0;

		int flag = 0;

		System.out.println("Welcome to Snake and Ladder Simulator!");
		while(positionPlayer1 != 100 && positionPlayer2 != 100)
		{
			if(flag == 0)
			{
				int dieP1 = (int) (Math.random()*6) + 1; 
				numberOfDiceRollsP1++;
				System.out.println("Dice Roll Player 1: " + dieP1);

				int optionP1 = (int) Math.floor(Math.random() * 10) % 3;
				if( optionP1 == 0)
				{
					//No Play
					positionPlayer1=positionPlayer1;
					flag = 1;
				}
				else if (optionP1 == 1)
				{
					//Ladder
					positionPlayer1 += dieP1;
					flag = 0;
				}
				else if (optionP1 == 2)
				{
					//Snake
					positionPlayer1 -= dieP1;
					flag = 1;
				}
				if(positionPlayer1 < 0)
					positionPlayer1 = 0;
				if(positionPlayer1 > 100)
					positionPlayer1 -= dieP1;
				System.out.println("Current Position Player 1: "+positionPlayer1);
			}
			if(flag == 1)
			{
				int dieP2 = (int) (Math.random()*6) + 1; 
				numberOfDiceRollsP2++;
				System.out.println("Dice Roll Player 2: " + dieP2);

				int optionP2 = (int) Math.floor(Math.random() * 10) % 3;
				if( optionP2 == 0)
				{
					//No Play
					positionPlayer2=positionPlayer2;
					flag = 0;
				}
				else if (optionP2 == 1)
				{
					//Ladder
					positionPlayer2 += dieP2;
					flag = 1;
				}
				else if (optionP2 == 2)
				{
					//Snake
					positionPlayer2 -= dieP2;
					flag = 0;
				}
				if(positionPlayer2 < 0)
					positionPlayer2 = 0;
				if(positionPlayer2 > 100)
					positionPlayer2 -= dieP2;
				System.out.println("Current Position Player 2: "+positionPlayer2);
			}
		}
		if(positionPlayer1 == 100)
			System.out.println(" Player 1 Wins! ");
		else
			System.out.println(" Player 2 Wins! ");
		System.out.println("Total number of Dice Rolls for Player 1: " + numberOfDiceRollsP1);

		System.out.println("Total number of Dice Rolls for Player 2: " + numberOfDiceRollsP2);
	}


}