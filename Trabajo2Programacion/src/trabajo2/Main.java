package trabajo2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Metodo para probar la clase Lista
		Lista l = new Lista();
		Lista r = new Lista(15);
		char letra = ' ';
		
		/*
		//prueba de constructor 
		l.MemReserve();
		r.MemReserve();
		/**/
		
		
		System.out.println("lista l");
		for(int i = 0; i<50; i++) {
			letra = (char)(Math.random()*127+'0');
			l.Anadir(letra);
			System.out.print(letra);
		}
		ln();
		l.mostrar();
		ln();
		
		System.out.println("tamaño l = "+l.Tamano());
		ln();
		
		System.out.println("lista r");
		for(int i = 0; i<50; i++) {
			letra = (char)(Math.random()*127+'0');
			r.Anadir(letra);
			System.out.print(letra);
		}
		ln();ln();
		
		l.Concatenar(r);
		l.mostrar();
		ln();
			
		l.borrar(letra);
		l.mostrar();
		try { 
			System.out.println(l.Get(7));
		}catch(Exception FueraDeLimitesException) {
			
		}
		/*
		l = new Lista();
		System.out.println(l.EstaVacia());
		/**/
		System.out.println(l.Contiene('e'));
		
		/**/
		
		//codigo para probar el metodo borrar
		/*
		System.out.println("lista l");
		l.Anadir('-');
		for(int i = 0; i<2; i++) {
			letra = (char)('b');
			l.Anadir(letra);
			//System.out.print(letra);
		}
		
		/*
		l.mostrar();
		ln();
		l.borrar('b');
		l.mostrar();
		/**/
		
		System.out.println("leer archivo");
		Lista j = file2lista("./mensaje.txt");
		j.mostrar();
		System.out.println("archivo leido");
	}/**/
	
	public static void ln() {
		System.out.println("");
	}
	
	public static Lista file2lista(String filename) {
		Lista out = new Lista();
		FileReader file;
		int character;
		
		try {
			file = new FileReader(filename);
			
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
}
