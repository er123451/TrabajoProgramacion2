package trabajo2;

@SuppressWarnings("serial")
public class FueraDeLimitesException extends Exception{

	public FueraDeLimitesException() {
		System.err.println("Fuera de rango");
	}
}
