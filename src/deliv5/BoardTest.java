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
	
	
	// Test on a method that checks to see if it is time for the program to search for a winner
	@Test
	public void checkReady_test1()
	{
		b.set(0,0, 'x');
		b.set(0,1, 'o');
		b.set(1,0, 'x');
		b.set(0,2, 'o');
		b.set(2,0, 'x');
		assertTrue(b.checkReady());
	}
	
	
	// Test a method that checks if there is a winner by filling a row with identical characters
	@Test
	public void rowWin_test()
	{
		b.set(0,0, 'x');
		b.set(1,1, 'o');
		b.set(0,1, 'x');
		b.set(2,2, 'o');
		b.set(0,2, 'x');
		assertTrue(b.rowWin());	
	}
	
	
	// Test a method that checks if there is a winner by filling a column with identical characters
	@Test
	public void columnWin_test()
	{
		b.set(0,1, 'x');
		b.set(1,0, 'o');
		b.set(1,1, 'x');
		b.set(2,2, 'o');
		b.set(2,1, 'x');
		assertTrue(b.columnWin());	
	}
	
	
	
}
