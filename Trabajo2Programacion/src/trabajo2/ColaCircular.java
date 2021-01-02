package trabajo2;


public class ColaCircular 
{
	//definimos las variables principales
	char [] colacir;
	int ini;
	int fin;
	int elementos;

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
		//int diferencia = fin - ini;
		//if ((diferencia+1 == this.colacir.length) || ((diferencia+this.colacir.length+1 == this.colacir.length) & (diferencia < 0)))
		if (colacir.length == elementos)
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
			
			/*//Debug---------------------------
			System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
				/**/
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
			
			/*//Debug---------------------------
			System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
				/**/
		}while(i != fin);
	
		return concatenate;
	}
	
//debug-------------------------------------------
	/*
	public void TamanoArray() {
	System.out.println(colacir.length);	
	}
	
	/**/
}
		
