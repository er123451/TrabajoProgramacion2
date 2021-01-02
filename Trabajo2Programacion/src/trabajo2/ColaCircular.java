package trabajo2;


public class ColaCircular 
{
	//definimos las variables principales
	char [] colacir;
	int ini;
	int fin;
	private int elementos;

	//constructores
	
	public ColaCircular (int tamano) 
	{
		colacir = new char[tamano];
	    ini = 0;
	    fin = 0;
	    elementos = 0;
	}
	
	public ColaCircular()
	{
		colacir = new char [10];
		ini = 0;
		fin = 0;
		elementos = 0;
	}
	
	//Métodos
	
	public int tamano()
	{
		int longitud = fin-ini+1;
		return (longitud);
	}

	
	public char primero() throws ColaVaciaException
	{
		
		if (estaVacia())
		{
			throw new ColaVaciaException();		//Rama de error
		}
		else
		{
			return colacir[ini];
		}
	}
	
	

	public void anadir (char e) throws ColaLlenaException
	{
		
		if (estaLlena())
		{
			throw new ColaLlenaException();		//Rama de error
		}
		else
		{
			if (fin == colacir.length) {
				fin = 0;
			}
			colacir[fin++] = e;
			elementos++;
		}
		
		return;
	}
		
	
	public char extraer () throws ColaVaciaException
	{
		// Variables locales de la función 
		char elemento; 		// Elemento a extraer
		
		// Extracción
		if (estaVacia())
		{
			throw new ColaVaciaException ();		// Rama de error
		}
		else
		{
			elemento = colacir[ini++];			// Extracción 
			elementos--;
		}
		
		return elemento;
	}      
		
	
	//
	public boolean estaVacia()
	{
		return (elementos == 0);
	}
		
	
	
	public boolean estaLlena()
	{
		return (colacir.length == elementos);
	}
		  
		
	public boolean contiene (char e)
	{
		boolean test = false;
		String mostrar = mostrarString();
		char[] data = mostrar.toCharArray();
		for(int i  = 0; i < data.length ; i++)
		{
			if (data[i] == e)
			{
				test=true;
			}
		}
		
		return test;
	}
	
	

	public void mostrar () 
	{
		String concatenate = "";
		char letra;
		int i = ini;
		do
		{
			if (i == colacir.length) {
				i = 0;
			}
			letra = colacir[i++];
			concatenate += letra;

		}while(i != fin);
	
		System.out.print(concatenate);
	}
	
//auxiliares--------------------------------------
	private String mostrarString () 
	{
		String concatenate = "";
		char letra;
		int i = ini;
		do
		{
			if (i == colacir.length) {
				i = 0;
			}
			letra = colacir[i++];
			concatenate += letra;
			
		}while(i != fin);
	
		return concatenate;
	}

}
		
