package trabajo2;


public class ColaCircular 
{
	//Definimos las variables principales
	private char [] colacir;		// Cola circular
	private int ini;		// �ndice para registrar el valor del primer elemento v�lido
	private int fin;		// �ndice para registrar el valor del �ltimo elemento v�lido
	private int elementos;		//N�mero de elementos

	//constructores
	
	public ColaCircular (int tamano) 
	{
		// Crea una cola con tama�o tamano
		colacir = new char[tamano];
		
		// Inicializa los �ndices
	    ini = 0;
	    fin = 0;
	    elementos = 0;
	}
	
	public ColaCircular()
	{
		// Crea una cola con tama�o m�ximo 10
		colacir = new char [10];
		
		// Inicializa los �ndices
		ini = 0;
		fin = 0;
		elementos = 0;
	}
	
	//M�todos
	
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
			return colacir[ini];		// Devuelve el primer elemento v�lido
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
			colacir[fin++] = e;		// Adici�n
			elementos++;
		}
		
		return;
	}
		
	
	public char extraer () throws ColaVaciaException
	{
		// Variables locales de la funci�n 
		char elemento; 		// Elemento a extraer
		
		// Extracci�n
		if (estaVacia())
		{
			throw new ColaVaciaException ();		// Rama de error
		}
		else
		{
			elemento = colacir[ini++];			// Extracci�n 
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
		boolean test = false;		// Variable para comprobar si el elemento e est� en la cola
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
	
	//M�todos auxiliares para realizar ColaCircular
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