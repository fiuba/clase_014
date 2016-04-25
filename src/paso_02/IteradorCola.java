package paso_02;

import java.util.Iterator;
import java.util.NoSuchElementException;

import paso_00.ColaVacia;

public class IteradorCola<T> implements Iterator<T> {

	private Cola02<T> coleccion;

	public IteradorCola(Cola02<T> cola) {
		this.coleccion = cola;
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
		} catch ( ColaVacia e) {
			throw new NoSuchElementException();
		}
		
		return result;
	}

}
