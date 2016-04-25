package paso_02;

import java.util.Iterator;
import java.util.NoSuchElementException;

import paso_00.PilaVacia;

public class IteradorPila<T> implements Iterator<T> {

	private Pila02<T> coleccion;
	
	public IteradorPila(Pila02<T> pila) {
		coleccion = pila;
	}

	@Override
	public boolean hasNext() {
		return coleccion.noEstaVacia();
	}

	@Override
	public T next() throws NoSuchElementException {
		T result;
		
		try {
			result = coleccion.quitar();
		} catch ( PilaVacia e) {
			throw new NoSuchElementException();
		}
		
		return result;
	}
}
