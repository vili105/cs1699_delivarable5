package deliv5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MainGameTest {
	
	MainGame g;
	
	@Before
	public void init()
	{
		g = new MainGame();
	}
	

	// Tests a function that checks if the input is valid
	@Test
	public void validInput_test()
	{	
		assertTrue(g.validInput(1,1));
	}
	
	// Tests a function that checks if the input is valid
	@Test
	public void validInput_test1()
	{	
		assertFalse(g.validInput(3,5));
	}

}
