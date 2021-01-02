package trabajo2;

public class Lista {
	//variables-------------------------------------------
	private char[]list;
	private int pos; //Posición del cursor (primera celda vacía de char[]list
	
	//constructores---------------------------------------
	
	public Lista(int size) {
		list = new char[size];
		pos = 0;
	}
	public Lista() {
		list = new char[10];
		pos = 0;
	}
	
	//metodos---------------------------------------------
	
	public int Tamano() {
		//Devuelve el numero de elementos 
		return pos;
	}
	
	public void Anadir(char e){
		//Añade un elemento a la lista, si la lista esta llena aumenta su tamaño 10 celdas 
		if (this.list.length<this.pos+1) {
			Resize(list.length+10);
		}
		list[pos++] = e;
	}
	
	public void Concatenar(Lista in){
		//une dos listas en una sola
		for (int i = 0;i<in.Tamano();i++) {
			try {
				Anadir(in.Get(i));
			}catch(FueraDeLimitesException e) {
				
			}
		}
	}
	
	public void borrar(char e) {
		//Elimina todos los caracteres e de la lista y compacta
		for (int i = 0;i<list.length;i++) {
			if (list[i] == e) {
				Rm(i);
			}
		}
	}
	
	public char Get(int i) throws FueraDeLimitesException{
		//obtiene el caracter en la posición i
		if (i>= pos){
			//si la posición pedida está mas allá del tamaño de la lista, lanza un FueraDeLimitesException
			throw new FueraDeLimitesException();
		}
		return list[i];
	}
	
	public boolean EstaVacia() {
		//comprueba si la lista está vacía
		return (pos == 0);
	}
	
	public boolean Contiene(char e) {
		//comprueba si el caracter e está contenido en la lista 
		boolean test = false;
		for (int i = 0;i<list.length;i++) {
			if (list[i] == e) {
				test = true;
			}
		}
		return test;
	}
	
	public void mostrar() {
		//escribe el contenido de la lista en pantalla (no salta linea)
		String concatenate = "";
		for(char i : this.list) {
			concatenate +=i; 
		}
		System.out.print(concatenate);
	}
	
	
	
	
//metodos auxiliares de la clase (private)---------
	
	private void Resize(int size){
		char[]buffer = list;
		this.list = new char[size];
		for (int i=0; i<buffer.length;i++) {
			this.list[i] = buffer[i];
		}
	}
	
	private void Rm(int p) {
		char[] buffer = new char[list.length];
		int j = 0;
		for (int i = 0; i<list.length;i++) {
			try {
				if(i == p) i++;
				buffer[j++] = list[i];
			}catch(Exception e) {}
		}
		list = buffer;
		pos--;
	}
}
