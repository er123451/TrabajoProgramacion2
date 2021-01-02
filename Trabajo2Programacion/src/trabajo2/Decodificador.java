package trabajo2;

import java.io.*;

public class Decodificador 
{
//variables---------------------------------------------
	static Lista encoded = new Lista();
	
//Main--------------------------------------------------
	public static void main(String[] args) 
	{
		//Parametros
		Lista data = new Lista();
		data = file2lista("mensaje.txt");
		try 
		{
			int n = Procesar(data); //Num total de filas
			int l = encoded.Tamano(); //Longitud del texto
			int i;
			
			//decodificador
			Lista lista = new Lista(l);
			
			
			for(i = 0; i<l; i++)
			{
				lista.Anadir(encoded.Get(i));
			}
			int c = l/n; //num de columnas
			
			ColaCircular arrayCola[] = new ColaCircular[n];
			
			for(i = 0; i<n; i++)
			{
				arrayCola[i] = new ColaCircular(c);
			}
			
			for(i = 0; i<l; i++)
			{
				arrayCola[i%n].anadir(lista.Get(i));
			}
			for (i = 0; i<arrayCola.length; i++)
			{
				arrayCola[i].mostrar();
			}
			
			ln();
		} catch (FueraDeLimitesException e) 
		{
			e.printStackTrace();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
//Metodos auxiliares----------------------------------------------
	
	public static Lista file2lista(String PruebaDecodificador) {
	    Lista out = new Lista();
	    FileReader file;
	    int character;
	    
	    try {
	        file = new FileReader(PruebaDecodificador);
	        
	        while((character = file.read()) != -1)
	        {
	           out.Anadir((char)character);
	        }
	
	    } catch (FileNotFoundException e) 
	    {
	    	e.printStackTrace();
	    } catch (IOException e) 
	    {
	    	e.printStackTrace();
		}  
		return out;
	}
	
	private static int Procesar(Lista i){
		int out = 0;
		try {
			char lastChar;
			lastChar = i.Get(0);
			int j = 1; 
			int ascii = 0;
			String concatenate = "";
			do 
			{
				concatenate += lastChar;
				lastChar = i.Get(j++);
				
			}while(lastChar != ((char)13));
			
			//pasa SOLO EL MENSAJE a otra lista
			for(int k = 0; k<(i.Tamano()-j);) 
			{
				ascii = (int)i.Get(k+j);
				if((ascii != 10) && ascii != 13) 
				{
					encoded.Anadir(i.Get((k++)+j));
				}else j++;
			}		
			out = Integer.parseInt(concatenate);
		} catch (FueraDeLimitesException e) {
			e.printStackTrace();
		}
		return out;
	}
	
	public static void ln() {
		System.out.println("");
	}
}
