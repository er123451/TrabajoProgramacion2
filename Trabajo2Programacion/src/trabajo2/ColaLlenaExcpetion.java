package trabajo2;


	public class ColaLlenaExcpetion extends  Exception
	{
		public ColaLlenaException() 
		{
			System.err.println("La cola está llena");			
		}
	}
