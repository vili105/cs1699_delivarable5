package deliv5;

import java.util.Scanner;

public class MainGame {

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
		int[] p_input = new int[2];
		Scanner in = new Scanner(System.in);
		p_input[0] = in.nextInt();
		p_input[1] = in.nextInt();
		in.close();
		return p_input;
		
	}
	

}
