package paso_01;

import java.util.Iterator;
import java.util.NoSuchElementException;

import paso_00.PilaVacia;

public class IteradorPila implements Iterator {
	
	private Pila01 coleccion;

	public IteradorPila(Pila01 pila) {
		this.coleccion = pila;
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
		} catch ( PilaVacia e) {
			throw new NoSuchElementException();
		}
		
		return result;
	}

}
