package deliv5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class BoardTest {
	
	
	Board b;
	
	@Before
	public void init()
	{
		b = new Board();
	}
	

	// I start with testing the initial print of the game board
	// I decide how I want it to look and make test for it
	@Test
	public void drawInitialBoard_test()
	{
		assertEquals(b.drawInitialBoard()," | | \n------\n | | \n------\n | | \n");
	}

	
	// Test the functionality of checking the value of the desired position
	@Test
	public void get_test()
	{
		b.set(1,2,'x');
		assertEquals(b.get(1,2),'x');
	}
	
	
	// Test on a method that checks to see if it is time for the program to search for a winner
	@Test
	public void checkReady_test()
	{
		b.set(1,1, 'x');
		b.set(1,2, 'o');
		assertFalse(b.checkReady());
	}
	
	
	
}
