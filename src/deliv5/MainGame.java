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
		p_input[0] = in.nextInt();
		p_input[1] = in.nextInt();
		in.close();
		return p_input;
		
	}
	
	
	// Implementation of the driver function
	public int Run()
	{
		boolean win = false;
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
			win = b.rowWin();
			win = b.columnWin();
			win = b.diagRLWin();
			win = b.diagRLWin();
		}
		
		b.statePrint();
		
		if(win==true)
		{
			return player;
		}
		else
		{
			return 0;
		}
	}
		
	
	

}
