package Proyectos.Clases;

public class ColaInt {
	private final int capacidad;
	private int datos[];
	private int fin, frente, cantidad;

	public ColaInt(int cap) {
		this.capacidad = cap;
		this.datos = new int[capacidad];
		this.fin = -1; 
		this.frente = 0;
		this.cantidad=0;  
	}


    public boolean estaVacia() {
        return cantidad == 0;
}

    public boolean estaLlena() {
        return cantidad == capacidad;
}

    public void meter(int dato) {
        if (!estaLlena()) {
            fin = (fin + 1) % capacidad;
            datos[fin] = dato;
            cantidad++;
    }
}

    public int sacar() {
		int dato = 0;
		if (cantidad != 0) {
			dato = datos[frente];
			frente = (frente + 1) % capacidad;
			cantidad--;
		}
		return dato;
}

    public int peek() {
        if (estaVacia()) {
            throw new RuntimeException("La cola está vacía");
        }
        return datos[frente];
    }

	public String toString() {
		String resultado = "";
		for (int j = 0; j < cantidad; j++) {
			int idx = (frente + j) % capacidad; 
			resultado += datos[idx] + " ";      
		}
		return resultado;
}



	public boolean contiene(int x){
		boolean resultado = false;
		ColaInt2 cAux = new ColaInt2(capacidad);
		while(!this.estaVacia()){
			int aux = this.sacar();
			if (aux == x){
				resultado = true;
			}
			cAux.meter(aux);
		}
		while(!cAux.estaVacia()){
			this.meter(cAux.sacar());
		}
		return resultado;
	}


	public int eliminarTodas(int x){
		ColaInt2 c1 = new ColaInt2(capacidad);
		ColaInt2 c2 = new ColaInt2(capacidad);
		int cant=0;
		while(!this.estaVacia()){
			int num = this.sacar();
			if (num == x){
				c2.meter(num);
				cant++;
			} else {
				c1.meter(num);
			}
		}
		while(!c1.estaVacia()){
			this.meter(c1.sacar());
		}
		return cant;
		}

	public ColaInt2 invertir() {
		if (this.estaVacia()) {
			return new ColaInt2(capacidad);
		} else {
			int aux = this.sacar();             
			ColaInt2 invertida = this.invertir(); 
			invertida.meter(aux);                
			return invertida;                   
		}
	}
}
