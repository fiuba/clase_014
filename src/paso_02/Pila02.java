package paso_02;

import java.util.ArrayList;
import java.util.Iterator;

import paso_00.PilaVacia;

public class Pila02<T> implements Iterable<T> {
	
	private ArrayList<T> contenido;
	
	public Pila02() {
		contenido = new ArrayList<T>();
	}
	
	public T quitar() throws PilaVacia {
		try {
			return contenido.remove(contenido.size() - 1);
		} catch (IndexOutOfBoundsException e) {
			throw new PilaVacia();
		}
	}

	public void apilar(T valor) {
		contenido.add(valor);
	}

	public Iterator<T> iterator() {
		return (Iterator<T>)(new IteradorPila<T>(this));
	}

	public boolean noEstaVacia() {
		return contenido.size() != 0;
	}

	public boolean estaVacia() {
		return !noEstaVacia();
	}

}
