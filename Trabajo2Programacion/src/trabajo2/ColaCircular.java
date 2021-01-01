
public class ColaCircular 
{
	//definimos las variables principales
	char [] colacir;
	int ini;
	int fin;

	//constructores
	
	public ColaCircular (int tamano) 
	{
		colacir = new char[tamano];
	    ini = 0;
	    fin = 0;
	}
	
	public ColaCircular()
	{
		colacir = new char [10];
		ini = 0;
		fin = 0;
	}
	
	//Métodos
	
	public int tamano()
	{
		int longitud = fin-ini+1;
		return (longitud);
	}

	
	public char primero() 
	{
		
		if (estaVacia())
		{
			throw new ColaVaciaExcpetion();		//Rama de error
		}
		else
		{
			return colacir[ini];
		}
	}
	
	

	public void anadir (char e)
	{
		
		if (estaLlena())
		{
			throw new ColaLlenaExcpetion();		//Rama de error
		}
		else
		{
			colacir[fin++] = e;
		}
		
		return;
	}
		
	
	public char extraer () 
	{
		// Variables locales de la función 
		char elemento; 		// Elemento a extraer
		
		// Extracción
		if (estaVacia())
		{
			throw new ColaVaciaExcpetion ();		// Rama de error
		}
		else
		{
			elemento = colacir[ini++];			// Extracción 
		}
		
		return elemento;
	}      
		
	
	//
	public boolean estaVacia()
	{
		boolean full; 
		int diferencia =fin - ini;
		
		if (diferencia == 0) 
		{
			full = true;
		}
		else
		{
			full = false;
		}
		
		return full;
	}
		
	
	
	public boolean estaLlena()
	{
		boolean full;
		int diferencia = fin - ini;
		if (diferencia+1 == this.colacir.length) || ((diferencia+this.colacir.length+1 == this.colacir.length) & (difernecia < 0))
		{
			full = true;
		}
		else
		{
			full = false;
		}
		
		return full;
	}
		  
		
	public boolean contiene (char e)
	{
		boolean test = false;
		for(int i  = ini; i < fin ; i++)
		{
			if (colacir[i] == e)
			{
				test=true;
			}
		}
		
		return test;
	}
	
	

	public void mostrar () 
	{
		String concatenate = "";
		for(char i: this.colacir) {
			concatenate += i;
		}
	
		System.out.println(concatenate);
	}
}
		
