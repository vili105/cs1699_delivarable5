package deliv5;

public class Board
{
	
	private char[][] positions = new char[3][3];
	
	// My first drawInitialBoard_test() fails because the class that it tests and the constructor
	// do not exist. So, I write one that satisfies the test.
	public Board()
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{	
				positions[i][j] = ' ';
			}
			
		}
	}
	
	
	// My drawInitialBoard_test() fails because there is no implementation of the method it tests.
	// So, I write the implementation of the method.
	public String drawInitialBoard()
	{
		String temp = " | | \n------\n | | \n------\n | | \n";
		System.out.println(temp);	
		return temp;
	}
	
	// In order for get_test() to pass I need to implement set()
	public void set(int x, int y, char value)
	{
		positions[x][y] = value;
	}
	
	// Test get_test() tests get()
	public char get(int x, int y)
	{
		
		return positions[x][y];
		
	}
	
	// Implementation of the method checkReady() that is tested by checkReady_test()
	public Boolean checkReady()
	{
		int used_positions = 0;
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{	
				if(positions[i][j]!=' ')
				{
					used_positions++;
				}
			}
			
		}
		
		if(used_positions>4)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Implementation of the rowWin() method which searches for a winner by checking the rows
	public Boolean rowWin()
	{
		Boolean flag = false;
		
		for(int i=0; i<3; i++)
		{
			if(positions[i][0]==positions[i][1] && positions[i][1] ==positions[i][2])
			{
				flag = true;
			}
		}
		
		return flag;
	}
	
	
	// Implementation of the columnWin() method which searches for a winner by checking the columns
	public Boolean columnWin()
	{
		Boolean flag = false;
		
		for(int i=0; i<3; i++)
		{
			if(positions[0][i]==positions[1][i] && positions[1][i] ==positions[2][i])
			{
				flag = true;
			}
		}
		
		return flag;
	}

	
	// Implementation of the diagLRWin() method which searches for a winner by checking the LR diagonal
	public Boolean diagLRWin()
	{
		if(positions[0][0]==positions[1][1] && positions[1][1] ==positions[2][2])
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	// Implementation of the diagLRWin() method which searches for a winner by checking the RL diagonal
	public Boolean diagRLWin()
	{
		if(positions[0][2]==positions[1][1] && positions[1][1] ==positions[2][0])
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	// Implementation of statePrint(). The code is just enough to satisfy the test
	public void statePrint()
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{	
				System.out.print(positions[i][j]);
				
				if(j<2)
				{
					System.out.print("|");
				}
			}
			
			System.out.print("\n");
			
			if(i<2)
			{
				System.out.print("------");
			}
			
			System.out.print("\n");
			
		}
	}
}




