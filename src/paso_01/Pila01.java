package paso_01;

import java.util.ArrayList;
import java.util.Iterator;

import paso_00.PilaVacia;

public class Pila01 implements Iterable {
	private ArrayList contenido;
	
	public Pila01() {
		contenido = new ArrayList();
	}
	
	public void agregar(Integer valor) {
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

	@Override
	public Iterator iterator() {
		
		return new IteradorPila(this);
	}


}
