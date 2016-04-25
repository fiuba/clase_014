package paso_01;

import java.util.Iterator;
import java.util.NoSuchElementException;

import paso_00.ColaVacia;

public class IteradorCola implements Iterator {

	private Cola01 coleccion;

	public IteradorCola(Cola01 cola) {
		this.coleccion = cola;
	}

	@Override
	public boolean hasNext() {
		return coleccion.noEstaVacia();
	}

	@Override
	public Object next() throws NoSuchElementException{
		Object result;
			
		try {
			result = coleccion.quitar();
		} catch ( ColaVacia e) {
			throw new NoSuchElementException();
		}
		
		return result;
	}

}
