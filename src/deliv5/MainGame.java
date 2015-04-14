package deliv5;

public class MainGame {

	public Boolean validInput(int x, int y)
	{
		if((x>-1)&&(x<3)&&(y>-1)&&(y<3))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
