package trabajo2;


	@SuppressWarnings("serial")
	public class ColaLlenaException extends  Exception
	{
		public ColaLlenaException() 
		{
			System.err.println("No hay hueco en el array dado que está lleno");
			
		}
	

	}
