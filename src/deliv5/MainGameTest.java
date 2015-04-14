package deliv5;

import static org.junit.Assert.*;
import org.junit.Test;


public class MainGameTest {

	// Tests a function that checks if the input is valid
	@Test
	public void validInput_test()
	{	
		MainGame g = new MainGame();
		assertTrue(g.validInput(1,1));
	}

}
