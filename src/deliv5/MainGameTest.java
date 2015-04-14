package deliv5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainGameTest {
	
	MainGame g;
	ByteArrayInputStream in;
	ByteArrayOutputStream out;
	
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


	// Test a function that handles the player's input
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

	
	//Test a function that runs the game
	@Test
	public void Run_test()
	{
		byte[] numbers = "1\n0\n".getBytes();
		in = new ByteArrayInputStream(numbers);
		System.setIn(in);
		assertEquals(g.Run(),0);
	}

	//Test a function that runs the game
	@Test
	public void Init_test()
	{
		System.setOut(new PrintStream(out));
		g.Init();
		assertTrue(out.toString().contains("x|o|x\n------\no|x| \n------\n | | \n"));
	}
	
	
}
