package deliv5;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {
	

	// I start with testing the initial print of the game board
	// I decide how I want it to look and make test for it
	@Test
	public void drawInitialBoard_test()
	{
		
		Board b = new Board();
		assertEquals(b.drawInitialBoard()," | | \n------\n | | \n------\n | | \n");
	}

}
