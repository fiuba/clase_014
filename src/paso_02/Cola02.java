package paso_02;

import java.util.ArrayList;
import java.util.Iterator;

import paso_00.ColaVacia;

public class Cola02<T> implements Iterable<T> {
	private ArrayList<T> contenido;

	public Cola02() {
		contenido = new ArrayList<T>();
	}
	
	public Iterator<T> iterator() {
		return (Iterator<T>)(new IteradorCola<T>(this));
	}

	public void agregar(T valor) {
		contenido.add(valor);
	}

	public T quitar() throws ColaVacia {
		try {
			return contenido.remove(0);
		} catch (IndexOutOfBoundsException e) {
			throw new ColaVacia();
		}
	}

	public boolean noEstaVacia() {
		return contenido.size() != 0;
	}

	public boolean estaVacia() {
		return !noEstaVacia();
	}


}
