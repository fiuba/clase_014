package test.paso_02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;

import paso_02.Pila02;

public class TestPila02 {

	@Test
	public void testAlAgregarUnosDatoElIteradorDebeResponderQueHayElementos() {
		Pila02<Integer> pila = new Pila02<Integer>();
		
		Iterator<Integer> i = pila.iterator();

		pila.apilar(new Integer(1));
		pila.apilar(new Integer(2));
	
		assertTrue(i.hasNext());
	}
	
	@Test
	public void testCuandoTieneVariosElementosIteradorDebeDevolverValoresEnLlamadasSucesivas() {
		Pila02<Integer> pila = new Pila02<Integer>();
		
		Iterator<Integer> i = pila.iterator();

		pila.apilar(new Integer(1));
		pila.apilar(new Integer(2));

		assertEquals(i.next(), new Integer(2));
		assertEquals(i.next(), new Integer(1));
	}

}
