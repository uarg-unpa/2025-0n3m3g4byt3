package Proyectos.Clases;

    public class PilaInt {
	int [] elementos;
	public int cima;
	public final int maxpila;


	public PilaInt(int cant) {
		maxpila = cant;
		elementos = new int[maxpila];
		cima = -1;
	}



	public boolean estaVacia() {
		return (cima == -1);
	}
	
	public boolean estaLlena() {
		return (cima == maxpila-1);
	}

	public void meter(int e) {     
		cima = cima+1;	
        elementos[cima]=e;           			
	}

	public int sacar() {		      
		int aux = elementos[cima];
		cima = cima - 1;    
		return aux;
	}

	public int getCima(){
		return cima;
	}

	public int verTope(){
		return elementos[cima];
	}
	}