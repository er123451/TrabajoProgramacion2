package trabajo2;

public class ColaCircular
{
	// Variables que definen la cola
	char [] colacir;			// Cola circular
	int ini;							// Índice para registrar el valor del primer elemento válido
	int fin;							// Índice para registrar el valor del último elemento válido
	int elementos;

	// Constructores
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

	// Metodos
	public int tamano()
	{
		int longitud = fin-ini+1;		// Calcula el tamano ocupado en la cola
		return (longitud);
	}

	public char primero() throws ColaVaciaException
	{
		if (estaVacia())
		{
			throw new ColaVaciaException();		// Rama de error
		}
		else
		{
			return colacir[ini];							// Devuelve el primer elemento válido
		}
	}

	public void anadir (char e) throws ColaLlenaException
	{
		if (estaLlena())
		{
			throw new ColaLlenaException();		// Rama de error
		}
		else
		{
			
			colacir[fin++] = e;			// Adición
			elementos++;
			if (fin == colacir.length) {
				fin = 0;
			}
		}

		return;
	}


	public char extraer () throws ColaVaciaException
	{
		char elemento; 		// Elemento a extraer

		// Extracción
		if (estaVacia())
		{
			throw new ColaVaciaException ();		// Rama de error
		}
		else
		{
			
			elemento = colacir[ini++];			    // Extraccion
			elementos--;
			if (ini == colacir.length) {
				ini = 0;
			}
		}

		return elemento;
	}

	public boolean estaVacia()
	{
		boolean full; 								// Creamos la variable full, para comprobar si la cola esta llena
		int diferencia = fin - ini; 	// Medida de cuántos elementos hay insertados

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
		boolean full;  													// Variable para comprobar si la cola esta llena
		int diferencia = fin - ini;							// Numero de elementos insertados
		if ((diferencia+1 == this.colacir.length) || ((diferencia+1 == 0) & (diferencia < 0)))
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
		boolean test = false;  										// Variable para comprobar si el elemento e está en la cola
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

	//Metodos auxiliares para realizar la ColaCircular
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
