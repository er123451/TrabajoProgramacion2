package trabajo2;


@SuppressWarnings("serial")
public class ColaVaciaException extends Exception
{
	public ColaVaciaException ()
	{
		System.err.println ("La cola est� vac�a");
	}
}
