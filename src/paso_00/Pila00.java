package paso_00;

import java.util.ArrayList;

public class Pila00  {
	private ArrayList contenido;
	
	public Pila00() {
		contenido = new ArrayList();
	}
	
	public void apilar(Integer valor) {
		contenido.add(valor);		
	}

	public Object quitar() throws PilaVacia {
		try {
			return contenido.remove(contenido.size() - 1);
		} catch (IndexOutOfBoundsException e) {
			throw new PilaVacia();
		}
	}

	public boolean noEstaVacia() {
		return contenido.size() != 0;
	}

	public boolean estaVacia() {
		return !noEstaVacia();
	}

}
