package test.paso_00;

import static org.junit.Assert.*;

import org.junit.Test;

import paso_00.Pila00;
import paso_00.PilaVacia;

public class TestPila00 {

	@Test
	public void testAlAgregarUnosDatoDebePoderQuitarEsteUltimoElemento() throws PilaVacia {
		Pila00 pila = new Pila00();
		
		// Equivalentes
		pila.agregar(new Integer(1));
		pila.agregar(new Integer(2));
		
		pila.quitar().equals(new Integer(2));
	}

	@Test(expected=PilaVacia.class)
	public void testSiNoHayElementosEnLaPilaDebeLanzarErrorPilaVaciaSiIntentaQuitarElemento() throws PilaVacia {
		Pila00 pila = new Pila00();
		
		pila.quitar();
	}
}
