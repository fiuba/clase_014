package paso_00;

import java.util.ArrayList;

public class Cola00 {
	private ArrayList contenido;
	

	public Cola00() {
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

}
