package paso_01;

import java.util.ArrayList;
import java.util.Iterator;

import paso_00.ColaVacia;

public class Cola01 implements Iterable {
	private ArrayList contenido;
	

	public Cola01() {
		contenido = new ArrayList();
	}
	
	public void agregar(Integer valor) {
		contenido.add(valor);				
	}

	public Object quitar() throws ColaVacia {
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

	@Override
	public Iterator iterator() {
		
		return new IteradorCola(this);
	}


}
