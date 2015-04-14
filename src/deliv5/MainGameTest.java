package deliv5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;

public class MainGameTest {
	
	MainGame g;
	ByteArrayInputStream in;
	
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

	// Test a function that handles the player's imput
	@Test
	public void Input_test()
	{
		int[] temp = new int[2];
		byte[] numbers = "1\n2\n".getBytes();
		in = new ByteArrayInputStream(numbers);
		System.setIn(in);
		temp = g.Input();
		assertEquals(temp[0],1);
		assertEquals(temp[1],2);
		
	}
}
