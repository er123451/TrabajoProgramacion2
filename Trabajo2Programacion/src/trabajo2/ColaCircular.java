package trabajo2;


public class ColaCircular 
{
	//Definimos las variables principales
	private char [] colacir;		// Cola circular
	private int ini;		// Índice para registrar el valor del primer elemento válido
	private int fin;		// Índice para registrar el valor del último elemento válido
	private int elementos;		//Número de elementos

	//constructores
	
	public ColaCircular (int tamano) 
	{
		// Crea una cola con tamaño tamano
		colacir = new char[tamano];
		
		// Inicializa los índices
	    ini = 0;
	    fin = 0;
	    elementos = 0;
	}
	
	public ColaCircular()
	{
		// Crea una cola con tamaño máximo 10
		colacir = new char [10];
		
		// Inicializa los índices
		ini = 0;
		fin = 0;
		elementos = 0;
	}
	
	//Métodos
	
	public int tamano()
	{
		int longitud = fin-ini+1;		// Calcula el tamano ocupado en la cola
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
			return colacir[ini];		// Devuelve el primer elemento válido
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
			colacir[fin++] = e;		// Adición
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
		boolean test = false;		// Variable para comprobar si el elemento e está en la cola
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
	
	//Métodos auxiliares para realizar ColaCircular
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