package trabajo2;

public class Main {

	public static void main(String[] args) {
		// Metodo para probar la clase Lista
		Lista l = new Lista();
		Lista r = new Lista(15);
		
		/*
		//prueba de constructor 
		l.MemReserve();
		r.MemReserve();
		/**/
		
		char letra;
		System.out.println("lista l");
		for(int i = 0; i<2; i++) {
			letra = (char)(Math.random()*127+'0');
			l.Anadir(letra);
			l.Anadir('b');
			System.out.print(letra);
		}
		ln();
		l.mostrar();
		ln();
		
		System.out.println("tamaño l = "+l.Tamano());
		ln();
		
		System.out.println("lista r");
		for(int i = 0; i<2; i++) {
			letra = (char)(Math.random()*127+'0');
			r.Anadir(letra);
			System.out.print(letra);
		}
		ln();ln();
		
		l.Concatenar(r);
		l.mostrar();
		ln();
		
		l.Anadir('b');
		l.borrar('b');
		l.mostrar();
		ln();
			
		
		
		/**/
		
	}/**/
	
	public static void ln() {
		System.out.println("");
	}

}
