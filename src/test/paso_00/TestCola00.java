package test.paso_00;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import paso_00.Cola00;
import paso_00.ColaVacia;

public class TestCola00 {
	@Test
	public void testAlAgregarUnosDatosDebePoderQuitarElPrimerElementoAgregado() throws ColaVacia {
		Cola00 cola = new Cola00();
		
		// Equivalentes
		cola.agregar(new Integer(1));
		cola.agregar(new Integer(2));
		
		assertEquals(cola.quitar(), new Integer(1));
	}


}
