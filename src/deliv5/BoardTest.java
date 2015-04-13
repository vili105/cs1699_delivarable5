package deliv5;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.After;
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

}
