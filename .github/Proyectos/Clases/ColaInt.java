package Proyectos.Clases;
public class ColaInt {
	private final int maxcola;
	private int elementos[];
	private int ultimo;

	public ColaInt(int cap) {
		maxcola = cap;
		elementos=new int[maxcola];
		ultimo = -1;   
	}

	public boolean estaVacia() {
		return (ultimo==-1);
	}

	public boolean estaLlena() {
		return (ultimo==maxcola-1);
	}

	public void insertar(int elem) {      
		if (!this.estaLlena()){
			ultimo++;
			elementos[ultimo]=elem;         
		}
	}

	public int borrar() {
		int aux=elementos[0];
		for (int i=0; i<ultimo; i++) 
			elementos[i] = elementos[i+1];
			ultimo--;     
		return aux;
	}


	public int peek() {
		return elementos[0];
	}


	public boolean contiene(int x) {
		boolean encontrado = false;
		ColaInt colaAuxiliar = new ColaInt(maxcola);
		int aux=0;
		while(!this.estaVacia() && !encontrado) {
			aux = this.borrar();
			if (aux == x) {
				encontrado = true;
			}
			colaAuxiliar.insertar(aux);
		}
		while(!colaAuxiliar.estaVacia()) {
			this.insertar(colaAuxiliar.borrar());
		}
		return encontrado;
	}


	public int eliminarTodas(int x) {
		int contador = 0;
		ColaInt colaAuxiliar = new ColaInt(maxcola);
		int aux=0;
		while(!this.estaVacia()) {
			aux = this.borrar();
			if (aux == x) {
				contador++;
			} else {
				colaAuxiliar.insertar(aux);
			}
		}
		while(!colaAuxiliar.estaVacia()) {
			this.insertar(colaAuxiliar.borrar());
		}
		return contador;
	}

	public ColaInt invertir() {
		PilaInt pilaAuxiliar = new PilaInt(maxcola);
		while(!this.estaVacia()) {
			pilaAuxiliar.meter(this.borrar());
		}
		ColaInt colaInvertida = new ColaInt(maxcola);
		while(!pilaAuxiliar.estaVacia()) {
			colaInvertida.insertar(pilaAuxiliar.sacar());
		}
		return colaInvertida;
	}
}