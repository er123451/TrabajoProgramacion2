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
		int size = list.length+in.Tamano();
		double 
	}
	
//metodos auxiliares de la clase (private)
	
	private void Resize(int size){
		char[]buffer = list;
		this.list = new char[size];
		for (int i=0; i<buffer.length;i++) {
			this.list[i] = buffer[i];
		}
	}
	
}
