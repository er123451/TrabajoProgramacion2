package trabajo2;

public class ColaCircular 
{
	char [] colacir;
	int pos;




	public ColaCircular (int size) 
	{
		colacir = new char[size];
	    pos=0;
	
	}
	public ColaCircular()
	{
		colacir = new char [10];
		pos = 0;
	}
	
	public int tamano()
	{
		return pos;
	}

	public char primero() 
	{
		if (i=colacir.length) 
		{
			throw new ColaVaciaException();
			
		}
		return colacir[1];
	}
	
	
	

	public void añadir (char e)
	{
		if (this.colacir.length<this.pos+1)
		{
			throw new ColaLlenaExcpetion();
		}
		colacir [pos++]=e;
	
	
	}

	public char extraer () 
	{
		if(this.colacir.length<this.pos-1)
		{
			throw new ColaVaciaExcpetion();
		}
		
		colacir[pos--]=e;
	}
	
	
	
	public boolean estaVacia()
	{
		if (pos==0) {
			return true;
		}else 
		{
			return false;
		}
	}
		
	
	
	public boolean estaLlena()
	{
		if (pos==10) {
			return true;
			
		}else
		{
			return false;
		}
	}
		
	

	public boolean contiene (char e)
	{
		boolean test = false;
		for(int i=0;i<colacir.length;i++)
		{
			if (colacir[i]==e)
			{
				test=true;
			}
			
		}
		return test;
	}
	
	

	public void mostrar () 
	{
	
	}

