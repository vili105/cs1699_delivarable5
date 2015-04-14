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
	
	
	
	
	

}
