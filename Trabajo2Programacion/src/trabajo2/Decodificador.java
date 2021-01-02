package trabajo2;

import java.io.*;

public class Decodificador 
{
	 public static Lista file2lista(String PruebaDecodificador) {
	        Lista out = new Lista();
	        FileReader file;
	        int character;
	        
	        try {
	            file = new FileReader(PruebaDecodificador);
	            
	            while((character = file.read()) != -1){
	                /*
	                System.out.print((char)character);
	                Thread.sleep(100);
	                ln();
	                /**/
	               out.Anadir((char)character);
	            }

	        } catch (FileNotFoundException e) {
	            System.err.println("el archivo no existe");
	        } catch (IOException e) {
	            System.out.println("IO");
	        /*} catch (InterruptedException e) {
	            System.out.println("interr");*/
	       }
	        
	        
	        return out;
	    }

	 
	public static void main(String[] args) 
	{
		String texto = ("Sgrtetieou h r r syroseseiu asof rnSeuelud  cb s r ecmt,ieicicscaceLCutl dccsoee clti hotst ioleopeio rn sa moho o udslansulcnlrtti aona c eratard n iseeeegql asuodsataC,rtteoiec xnugf. nretso i ároj.");
		int n = 25; //Num total de filas
		int i; // caracter
		int l = texto.length(); //Longitud del texto
		Lista lista = new Lista(l);
		
		
		for(i = 0; i<l; i++)
		{
			lista.Anadir(texto.charAt(i));
		}
		
		int c = l/n; //num de columnas
		
		ColaCircular arrayCola[] = new ColaCircular[n];
		
		for(i = 0; i<n; i++)
		{
			arrayCola[i] = new ColaCircular(c);
		}
		
		for(i = 0; i<l; i++)
		{
			try
			{
				arrayCola[i%n].anadir(lista.Get(i));
			}
			catch(ColaLlenaException e1) {}
			catch(FueraDeLimitesException e2) {}
		}

		for (i = 0; i<arrayCola.length; i++)
		{
			arrayCola[i].mostrar();
		}
		
		ln();
	}
	
	 public static void ln() {
	        System.out.println("");
	    }
}
