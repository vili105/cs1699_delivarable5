package deliv5;

import java.util.Scanner;

public class MainGame {
	
	private int player;
	private Board b;

	
	public MainGame()
	{
		player = 2;
		b = new Board();
	}
	
	
	// Initializing method
	public void Init()
	{
		b.drawInitialBoard();
	}
	
	// Function that tests if the input is valid
	public Boolean validInput(int x, int y)
	{
		if((x>-1)&&(x<3)&&(y>-1)&&(y<3))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	// Implementation of handling the player's input
	public int[] Input()
	{
		System.out.println("Enter the coordinates of the position of your choosing.");
		int[] p_input = new int[2];
		Scanner in = new Scanner(System.in);
		System.out.println("x: ");
		p_input[0] = in.nextInt();
		System.out.println("y: ");
		p_input[1] = in.nextInt();
		in.close();
		return p_input;
		
	}
	
	
	// Implementation of the game logic
	public int Run()
	{
		int[] position = new int[2];
		
		this.player = (this.player% 2)+1;
		System.out.println("Player " + player + " is playing.");
		position = Input();
			
		if(player ==1 && validInput(position[0], position[1]))
		{
			b.set(position[0], position[1] , 'x');
		}
		else if(player == 2 && validInput(position[0], position[1]))
		{
			b.set(position[0], position[1] , 'o');
		}
		
		if(b.checkReady()==true)
		{
			if (b.rowWin() || b.columnWin() || b.diagRLWin() || b.diagRLWin())
			{
				return player;
			}
		}

		b.statePrint();
		
		return 0;

	}
		
	
	// Main function
	public static void main (String[] args)
	{
		int count = 0;
		int flag = 0;
		MainGame mg = new MainGame();
		
		System.out.println("------------Tic Tac Toe--------------");
		mg.Init();
		
		while(count<9 && flag==0)
		{
			flag = mg.Run();
			count++;
		}
		
		if(flag==1)
		{
			System.out.println("Player 1 wins!");
		}
		else if(flag==2)
		{
			System.out.println("Player 2 wins!");
		}
		else
		{
			System.out.println("The game is a tie!");
		}
	}

}
