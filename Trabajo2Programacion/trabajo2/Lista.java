package trabajo2;

public class Lista {
	char[]list;
	int pos;
	public Lista(int size) {
		list = new char[size];
		pos = 0;
	}
	public Lista() {
		list = new char[10];
		pos = 0;
	}
	
	public int Tamano() {
		return pos;
	}
	
	public void Anadir(char e){
		if (this.list.length<this.pos+1) {
			Resize(list.length+10);
		}
		list[pos++] = e;
	}
	
	public void Concatenar(Lista in){
		for (int i = 0;i<list.length;i++) {
			Anadir(in.Get(i));
		}
	}
	
	public void borrar(char e) {
		for (int i = 0;i<list.length;i++) {
			if (list[i] == e) {
				Rm(i);
			}
		}
	}
	
	public char Get(int i) throws FueraDeLimitesException{
		if (i>= list.length){
			throw new FueraDeLimitesException();
		}
		return list[i];
	}
	
	public boolean EstaVacia() {
		if (pos == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean Contiene(char e) {
		boolean test = false;
		for (int i = 0;i<list.length;i++) {
			if (list[i] == e) {
				test = true;
			}
		}
		return test;
	}
//metodos auxiliares de la clase (private)
	
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
	}
}
